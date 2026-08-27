package org.scilab.forge.jlatexmath;

import a9.p;
import s3.c;

public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String strL = c.l(str, "@env");
        StringBuilder sbF = c.f(str2, " #");
        int i11 = i10 + 1;
        sbF.append(i11);
        sbF.append(" ");
        sbF.append(str3);
        NewCommandMacro.addNewCommand(strL, sbF.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(p.m("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String strL = c.l(str, "@env");
        StringBuilder sbF = c.f(str2, " #");
        int i11 = i10 + 1;
        sbF.append(i11);
        sbF.append(" ");
        sbF.append(str3);
        NewCommandMacro.addReNewCommand(strL, sbF.toString(), i11);
    }
}
