package org.scilab.forge.jlatexmath;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;

public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i) {
        String strM$1 = Fragment$$ExternalSyntheticOutline0.m$1(str, "@env");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" #");
        int i2 = i + 1;
        sb.append(i2);
        sb.append(" ");
        sb.append(str3);
        NewCommandMacro.addNewCommand(strM$1, sb.toString(), i2);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i) {
        if (NewCommandMacro.macrocode.get(str + "@env") == null) {
            throw new ParseException(Fragment$$ExternalSyntheticOutline0.m("Environment ", str, "is not defined ! Use newenvironment instead ..."));
        }
        String strM$1 = Fragment$$ExternalSyntheticOutline0.m$1(str, "@env");
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" #");
        int i2 = i + 1;
        sb.append(i2);
        sb.append(" ");
        sb.append(str3);
        NewCommandMacro.addReNewCommand(strM$1, sb.toString(), i2);
    }
}
