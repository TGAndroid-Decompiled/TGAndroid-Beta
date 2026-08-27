package org.scilab.forge.jlatexmath;

import a9.p;
import java.util.HashMap;
import java.util.regex.Matcher;

public class NewCommandMacro {
    protected static HashMap<String, String> macrocode = new HashMap<>();
    protected static HashMap<String, String> macroreplacement = new HashMap<>();

    public static void addNewCommand(String str, String str2, int i10) {
        macrocode.put(str, str2);
        MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i10));
    }

    public static void addReNewCommand(String str, String str2, int i10) {
        if (macrocode.get(str) == null) {
            throw new ParseException(p.m("Command ", str, " is not defined ! Use newcommand instead ..."));
        }
        macrocode.put(str, str2);
        MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i10));
    }

    public static boolean isMacro(String str) {
        return macrocode.containsKey(str);
    }

    public static void reset() {
        macrocode.clear();
        macroreplacement.clear();
    }

    public String executeMacro(TeXParser teXParser, String[] strArr) {
        int i10 = 0;
        String strReplaceAll = macrocode.get(strArr[0]);
        int length = strArr.length;
        int i11 = length - 11;
        String str = strArr[length - 10];
        if (str == null) {
            if (macroreplacement.get(strArr[0]) != null) {
                strReplaceAll = strReplaceAll.replaceAll("#1", Matcher.quoteReplacement(macroreplacement.get(strArr[0])));
            }
            for (int i12 = 1; i12 <= i11; i12++) {
                strReplaceAll = strReplaceAll.replaceAll("#" + (i12 + i10), Matcher.quoteReplacement(strArr[i12]));
            }
            return strReplaceAll;
        }
        strReplaceAll = strReplaceAll.replaceAll("#1", Matcher.quoteReplacement(str));
        i10 = 1;
        while (i12 <= i11) {
            strReplaceAll = strReplaceAll.replaceAll("#" + (i12 + i10), Matcher.quoteReplacement(strArr[i12]));
        }
        return strReplaceAll;
    }

    public static void addNewCommand(String str, String str2, int i10, String str3) {
        if (macrocode.get(str) == null) {
            macrocode.put(str, str2);
            macroreplacement.put(str, str3);
            MacroInfo.Commands.put(str, new MacroInfo("org.scilab.forge.jlatexmath.NewCommandMacro", "executeMacro", i10, 1.0f));
            return;
        }
        throw new ParseException(p.m("Command ", str, " already exists ! Use renewcommand instead ..."));
    }
}
