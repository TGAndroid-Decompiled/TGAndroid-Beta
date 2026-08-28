package org.scilab.forge.jlatexmath;

import aa.d;
import java.util.HashMap;
import ta.b;
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i9) {
        String j10 = b.j(str, "@env");
        StringBuilder e10 = b.e(str2, " #");
        int i10 = i9 + 1;
        e10.append(i10);
        e10.append(" ");
        e10.append(str3);
        NewCommandMacro.addNewCommand(j10, e10.toString(), i10);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i9) {
        HashMap<String, String> hashMap = NewCommandMacro.macrocode;
        if (hashMap.get(str + "@env") != null) {
            String j10 = b.j(str, "@env");
            StringBuilder e10 = b.e(str2, " #");
            int i10 = i9 + 1;
            e10.append(i10);
            e10.append(" ");
            e10.append(str3);
            NewCommandMacro.addReNewCommand(j10, e10.toString(), i10);
            return;
        }
        throw new ParseException(d.o("Environment ", str, "is not defined ! Use newenvironment instead ..."));
    }
}
