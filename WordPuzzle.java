import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WordPuzzle {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list)
    {
  
        // Create a new ArrayList
        ArrayList<T> newList = new ArrayList<T>();
  
        // Traverse through the first list
        for (T element : list) {
  
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
  
                newList.add(element);
            }
        }
  
        // return the new list
        return newList;
    }

    public static void seeRight(QuadraticProbingHashTable<String> table, HashMap<String, Boolean> map, ArrayList<String> results, char matrix[][], boolean en)
	{
		StringBuilder sb = new StringBuilder();	
        int R = matrix.length;
        int C = matrix[0].length;
		for (int row=0; row<R; row++)
		{
	        for (int col=0; col<C; col++)
	        {
			    sb.setLength(0);
	            for( int pos = 0; col + pos < C; pos++ ) 
	            {
        	        sb.append(matrix[row][col+pos]);
        	        boolean containPrefix = table.contains(sb.toString());     	
                    if (en == false && containPrefix == true)
                    {
                        results.add(new String(sb));
                    }
        	        else if (en == true && containPrefix == false)
                    {
                        sb.setLength(0);
                        break;
                    }
                    else if (en == true && containPrefix == true)
                    {   
                        if(map.get(sb.toString()) == true)
                        {
                            results.add(new String(sb));
                        }
                    }
	            }   
	        }
		}    
	}

    public static void seeRightDown(QuadraticProbingHashTable<String> table, HashMap<String, Boolean> map, ArrayList<String> results, char matrix[][], boolean en)
	{
		StringBuilder sb = new StringBuilder();	
        int R = matrix.length;
        int C = matrix[0].length;
		for (int row=0; row<R; row++)
		{
	        for (int col=0; col<C; col++)
	        {
			    sb.setLength(0);
	            for( int pos = 0; col + pos < C && row + pos < R; pos++ ) 
	            {
        	        sb.append(matrix[row+pos][col+pos]);
        	        boolean containPrefix = table.contains(sb.toString());     	
                    if (en == false && containPrefix == true)
                    {
                        results.add(new String(sb));
                    }
        	        else if (en == true && containPrefix == false)
                    {
                        sb.setLength(0);
                        break;
                    }
                    else if (en == true && containPrefix == true)
                    {   
                        if(map.get(sb.toString()) == true)
                        {
                            results.add(new String(sb));
                        }
                    }
	            }   
	        }
		}    
	}

    public static void seeDown(QuadraticProbingHashTable<String> table, HashMap<String, Boolean> map, ArrayList<String> results, char matrix[][], boolean en)
	{
		StringBuilder sb = new StringBuilder();	
        int R = matrix.length;
        int C = matrix[0].length;
		for (int row=0; row<R; row++)
		{
	        for (int col=0; col<C; col++)
	        {
			    sb.setLength(0);
	            for( int pos = 0; row + pos < R; pos++ ) 
	            {
        	        sb.append(matrix[row+pos][col]);
        	        boolean containPrefix = table.contains(sb.toString());     	
                    if (en == false && containPrefix == true)
                    {
                        results.add(new String(sb));
                    }
        	        else if (en == true && containPrefix == false)
                    {
                        sb.setLength(0);
                        break;
                    }
                    else if (en == true && containPrefix == true)
                    {   
                        if(map.get(sb.toString()) == true)
                        {
                            results.add(new String(sb));
                        }
                    }
	            }   
	        }
		}    
	}

    public static void seeLeftDown(QuadraticProbingHashTable<String> table, HashMap<String, Boolean> map, ArrayList<String> results, char matrix[][], boolean en)
	{
		StringBuilder sb = new StringBuilder();	
        int R = matrix.length;
        int C = matrix[0].length;
		for (int row=0; row<R; row++)
		{
	        for (int col=0; col<C; col++)
	        {
			    sb.setLength(0);
	            for( int pos = 0; row + pos < R && col - pos >= 0; pos++ ) 
	            {
        	        sb.append(matrix[row+pos][col-pos]);
        	        boolean containPrefix = table.contains(sb.toString());     	
                    if (en == false && containPrefix == true)
                    {
                        results.add(new String(sb));
                    }
        	        else if (en == true && containPrefix == false)
                    {
                        sb.setLength(0);
                        break;
                    }
                    else if (en == true && containPrefix == true)
                    {   
                        if(map.get(sb.toString()) == true)
                        {
                            results.add(new String(sb));
                        }
                    }
	            }   
	        }
		}    
	}

    public static void seeLeft(QuadraticProbingHashTable<String> table, HashMap<String, Boolean> map, ArrayList<String> results, char matrix[][], boolean en)
	{
		StringBuilder sb = new StringBuilder();	
        int R = matrix.length;
        int C = matrix[0].length;
		for (int row=0; row<R; row++)
		{
	        for (int col=0; col<C; col++)
	        {
			    sb.setLength(0);
	            for( int pos = 0; col - pos >= 0 ; pos++ ) 
	            {
        	        sb.append(matrix[row][col-pos]);
        	        boolean containPrefix = table.contains(sb.toString());     	
                    if (en == false && containPrefix == true)
                    {
                        results.add(new String(sb));
                    }
        	        else if (en == true && containPrefix == false)
                    {
                        sb.setLength(0);
                        break;
                    }
                    else if (en == true && containPrefix == true)
                    {   
                        if(map.get(sb.toString()) == true)
                        {
                            results.add(new String(sb));
                        }
                    }
	            }   
	        }
		}    
	}

    public static void seeLeftUp(QuadraticProbingHashTable<String> table, HashMap<String, Boolean> map, ArrayList<String> results, char matrix[][], boolean en)
	{
		StringBuilder sb = new StringBuilder();	
        int R = matrix.length;
        int C = matrix[0].length;
		for (int row=0; row<R; row++)
		{
	        for (int col=0; col<C; col++)
	        {
			    sb.setLength(0);
	            for( int pos = 0; col - pos >= 0 && row - pos >= 0; pos++ ) 
	            {
        	        sb.append(matrix[row-pos][col-pos]);
        	        boolean containPrefix = table.contains(sb.toString());     	
                    if (en == false && containPrefix == true)
                    {
                        results.add(new String(sb));
                    }
        	        else if (en == true && containPrefix == false)
                    {
                        sb.setLength(0);
                        break;
                    }
                    else if (en == true && containPrefix == true)
                    {   
                        if(map.get(sb.toString()) == true)
                        {
                            results.add(new String(sb));
                        }
                    }
	            }   
	        }
		}    
	}

    public static void seeUp(QuadraticProbingHashTable<String> table, HashMap<String, Boolean> map, ArrayList<String> results, char matrix[][], boolean en)
	{
		StringBuilder sb = new StringBuilder();	
        int R = matrix.length;
        int C = matrix[0].length;
		for (int row=0; row<R; row++)
		{
	        for (int col=0; col<C; col++)
	        {
			    sb.setLength(0);
	            for( int pos = 0; row - pos >= 0; pos++ ) 
	            {
        	        sb.append(matrix[row-pos][col]);
        	        boolean containPrefix = table.contains(sb.toString());     	
                    if (en == false && containPrefix == true)
                    {
                        results.add(new String(sb));
                    }
        	        else if (en == true && containPrefix == false)
                    {
                        sb.setLength(0);
                        break;
                    }
                    else if (en == true && containPrefix == true)
                    {   
                        if(map.get(sb.toString()) == true)
                        {
                            results.add(new String(sb));
                        }
                    }
	            }   
	        }
		}    
	}

    public static void seeRightUp(QuadraticProbingHashTable<String> table, HashMap<String, Boolean> map, ArrayList<String> results, char matrix[][], boolean en)
	{
		StringBuilder sb = new StringBuilder();	
        int R = matrix.length;
        int C = matrix[0].length;
		for (int row=0; row<R; row++)
		{
	        for (int col=0; col<C; col++)
	        {
			    sb.setLength(0);
	            for( int pos = 0; row-pos >= 0 && col + pos < C; pos++ ) 
	            {
        	        sb.append(matrix[row-pos][col+pos]);
        	        boolean containPrefix = table.contains(sb.toString());     	
                    if (en == false && containPrefix == true)
                    {
                        results.add(new String(sb));
                    }
        	        else if (en == true && containPrefix == false)
                    {
                        sb.setLength(0);
                        break;
                    }
                    else if (en == true && containPrefix == true)
                    {   
                        if(map.get(sb.toString()) == true)
                        {
                            results.add(new String(sb));
                        }
                    }
	            }   
	        }
		}    
	}

    public static void main( String [ ] args ) throws FileNotFoundException 
    {   
        // Input the row count R and the column count C
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the row count: ");

        // This method reads the number provided using keyboard
        int R = scan.nextInt();

        System.out.print("Enter the column count: ");

        // This method reads the number provided using keyboard
        int C = scan.nextInt();

        // Closing Scanner after the use
        
        // Displaying the number 
        System.out.println("The R and C entered by user are: (" + R + ", " + C + ")");

        // Generate the grid of random letters
        char[][] matrix = new char [R][C];
        for (int r = 0; r < R; r++){
           for (int c = 0; c < C; c++){
              int number = (int) (Math.random() * 26) + 97; // random lower case character
              matrix[r][c] = (char) number; 
              System.out.print(matrix[r][c] + " ");
           }//inner for loop
           System.out.println();
        }//outer for loop

        // Enhancement Mode
        System.out.println("Do you want the enhancement mode which detects the prefix of each word? true / false");

        boolean en = scan.nextBoolean();

        System.out.println("The enhancement mode activation: " + en);
        
        
        // read the dictionary from the file dictionary.txt
        QuadraticProbingHashTable<String> H = new QuadraticProbingHashTable<>();
        HashMap<String, Boolean> isWord = new HashMap<>();
        System.out.println("File name for the dictionary");
        String filename = scan.next();
        Scanner s = new Scanner(new File(filename));
        while (s.hasNext()){
            String word = s.next();
            if(Pattern.matches("\\p{Punct}", word)) // check if there is punctuation
            {
                continue;
            }
            if(word.length()>R && word.length()>C || word.length() == 1)
            {
                continue;
            }
            if(en == false)
            {
                H.insert(word);
            }
            else // activate enhancement mode, storing all prefixes of a given word in the dictionary
            {   
                for(int pos = 0; pos < word.length()-1; pos++)
                {
                    String subword = word.substring(0, pos+1);
                    if(!isWord.containsKey(subword))
                        isWord.put(subword, false);
                    H.insert(subword); 
                }
                isWord.put(word, true);
                H.insert(word);
            }
        }
        scan.close();
        s.close();
        System.out.println("Dictionary Length: " + H.capacity());
        ArrayList<String> wordsFound = new ArrayList<>();

        // Scan the matrix
        long startTime = System.currentTimeMillis( );
        seeRight(H, isWord, wordsFound, matrix, en);
        seeRightDown(H, isWord, wordsFound, matrix, en);
        seeDown(H, isWord, wordsFound, matrix, en);
        seeLeftDown(H, isWord, wordsFound, matrix, en);
        seeLeft(H, isWord, wordsFound, matrix, en);
        seeLeftUp(H, isWord, wordsFound, matrix, en);
        seeUp(H, isWord, wordsFound, matrix, en);
        seeRightUp(H, isWord, wordsFound, matrix, en);
        long endTime = System.currentTimeMillis( );
        wordsFound = removeDuplicates(wordsFound);
        Collections.sort(wordsFound);
        System.out.println("Printing words found: ");
        for(String a: wordsFound)
        {
            System.out.println(a);
        }
        System.out.println("Total "+wordsFound.size()+" words found, time taken = "+(endTime-startTime)+" ms");
    }



}
