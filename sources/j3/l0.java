package j3;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f8665a = new HashSet();
    public static String f8666b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f8665a.add(str)) {
                f8666b += ", " + str;
            }
        }
    }
}
