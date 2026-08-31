package j3;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f9245a = new HashSet();
    public static String f9246b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f9245a.add(str)) {
                f9246b += ", " + str;
            }
        }
    }
}
