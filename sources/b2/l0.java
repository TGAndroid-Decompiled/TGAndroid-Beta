package b2;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f3086a = new HashSet();
    public static String f3087b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f3086a.add(str)) {
                f3087b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (l0.class) {
            str = f3087b;
        }
        return str;
    }
}
