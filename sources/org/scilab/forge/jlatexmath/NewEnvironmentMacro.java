package org.scilab.forge.jlatexmath;

import android.support.v4.media.a;
import java.util.HashMap;
import w.c;
public class NewEnvironmentMacro extends NewCommandMacro {
    public static void addNewEnvironment(String str, String str2, String str3, int i10) {
        String e6 = c.e(str, "@env");
        StringBuilder f10 = c.f(str2, " #");
        int i11 = i10 + 1;
        f10.append(i11);
        f10.append(" ");
        f10.append(str3);
        NewCommandMacro.addNewCommand(e6, f10.toString(), i11);
    }

    public static void addReNewEnvironment(String str, String str2, String str3, int i10) {
        HashMap<String, String> hashMap = NewCommandMacro.macrocode;
        if (hashMap.get(str + "@env") != null) {
            String e6 = c.e(str, "@env");
            StringBuilder f10 = c.f(str2, " #");
            int i11 = i10 + 1;
            f10.append(i11);
            f10.append(" ");
            f10.append(str3);
            NewCommandMacro.addReNewCommand(e6, f10.toString(), i11);
            return;
        }
        throw new ParseException(a.o("Environment ", str, "is not defined ! Use newenvironment instead ..."));
    }
}
