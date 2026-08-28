package h3;

import java.util.HashSet;
public abstract class r0 {
    public static final HashSet f9686a = new HashSet();
    public static String f9687b = "goog.exo.core";

    public static synchronized void a(String str) {
        synchronized (r0.class) {
            if (f9686a.add(str)) {
                f9687b += ", " + str;
            }
        }
    }
}
