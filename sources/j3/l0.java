package j3;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f8647a = new HashSet();
    public static String f8648b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f8647a.add(str)) {
                f8648b += ", " + str;
            }
        }
    }
}
