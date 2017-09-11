package assignment4;
//package : Package is name that organizes a set of related classes and interfaces similar to 
//different folders on my computer
import java.util.Scanner;
//import : we use import keyword to access the packages.
//java.util.scanner : util is readymade package under the main package Java,so we import a pacakge 
//when we need to use some classes belonging to that pacakge in current program
public class Highestvalue {
//public : members which can access as public,public members are visible to all other classes.
//class : is a context of java that are used to create objects and to define object data types and methods.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;//int is a variable where we are using to intilize values.
		//declaring a value to the integer and a,b,c holds the values.
		
		System.out.println("enter the values of a,b and c");
		//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
		
		Scanner sc = new Scanner (System.in);
		////here we are using scanner to scan the values which we initilize.
		a=sc.nextInt();//it will scan next token of the input as int.
		b=sc.nextInt();//it will scan next token of the input as int.
		c=sc.nextInt();//it will scan next token of the input as int.
		
		if(a>b && a>c){//here we are checking if b is greater than a and c is greater than a.
			System.out.println("highest value "+a);
		}
		if(b>a && b>c){//here we are checking if a is greater than b and c is greater than b.
			System.out.println("highest value is "+b);
			
		}
		if(c>a && c>b){//here we are checking if a is greater than c and b is greater than c.
			System.out.println("highest value is "+c);//it will print highest number.
						
		}
	}


	}