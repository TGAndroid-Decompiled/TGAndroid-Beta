package j3;

import java.util.HashSet;
public abstract class r0 {
    public static final HashSet f10723a = new HashSet();
    public static String f10724b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (r0.class) {
            if (f10723a.add(str)) {
                f10724b += ", " + str;
            }
        }
    }
}
