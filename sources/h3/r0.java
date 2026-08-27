package h3;

import java.util.HashSet;

public abstract class r0 {

    public static final HashSet f8106a = new HashSet();

    public static String f8107b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f8106a.add(str)) {
            f8107b += ", " + str;
        }
    }
}
