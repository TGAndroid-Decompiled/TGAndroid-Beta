package org.scilab.forge.jlatexmath;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
public class MacroInfo {
    public static HashMap<String, MacroInfo> Commands = new HashMap<>(300);
    public static HashMap<String, Object> Packages = new HashMap<>();
    public boolean hasOptions;
    public Method macro;
    public int nbArgs;
    public Object pack;
    public int posOpts;

    public MacroInfo(String str, String str2, float f, float f2) {
        this.hasOptions = false;
        int i = (int) f;
        Class<?>[] clsArr = {TeXParser.class, String[].class};
        try {
            Object obj = Packages.get(str);
            if (obj == null) {
                obj = Class.forName(str).getConstructor(null).newInstance(null);
                Packages.put(str, obj);
            }
            this.pack = obj;
            this.macro = obj.getClass().getDeclaredMethod(str2, clsArr);
            this.nbArgs = i;
            this.hasOptions = true;
            this.posOpts = (int) f2;
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("Cannot load package " + str + ":");
            System.err.println(e.toString());
        }
    }

    public Object invoke(TeXParser teXParser, String[] strArr) {
        try {
            return this.macro.invoke(this.pack, teXParser, strArr);
        } catch (IllegalAccessException e) {
            String str = strArr[0];
            int line = teXParser.getLine();
            int col = teXParser.getCol();
            throw new ParseException("Problem with command " + str + " at position " + line + ":" + col + "\n", e);
        } catch (IllegalArgumentException e2) {
            String str2 = strArr[0];
            int line2 = teXParser.getLine();
            int col2 = teXParser.getCol();
            throw new ParseException("Problem with command " + str2 + " at position " + line2 + ":" + col2 + "\n", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            String str3 = strArr[0];
            int line3 = teXParser.getLine();
            int col3 = teXParser.getCol();
            String message = cause.getMessage();
            throw new ParseException("Problem with command " + str3 + " at position " + line3 + ":" + col3 + "\n" + message);
        }
    }

    public MacroInfo(Object obj, Method method, int i, int i2) {
        this(obj, method, i);
        this.hasOptions = true;
        this.posOpts = i2;
    }

    public MacroInfo(int i, int i2) {
        this((Object) null, (Method) null, i);
        this.hasOptions = true;
        this.posOpts = i2;
    }

    public MacroInfo(int i) {
        this((Object) null, (Method) null, i);
    }

    public MacroInfo(String str, String str2, float f) {
        this.hasOptions = false;
        int i = (int) f;
        Class<?>[] clsArr = {TeXParser.class, String[].class};
        try {
            Object obj = Packages.get(str);
            if (obj == null) {
                obj = Class.forName(str).getConstructor(null).newInstance(null);
                Packages.put(str, obj);
            }
            this.pack = obj;
            this.macro = obj.getClass().getDeclaredMethod(str2, clsArr);
            this.nbArgs = i;
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println("Cannot load package " + str + ":");
            System.err.println(e.toString());
        }
    }

    public MacroInfo(Object obj, Method method, int i) {
        this.hasOptions = false;
        this.pack = obj;
        this.macro = method;
        this.nbArgs = i;
    }
}
