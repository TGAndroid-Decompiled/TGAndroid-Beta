package b2;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f3087a = new HashSet();
    public static String f3088b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f3087a.add(str)) {
                f3088b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (l0.class) {
            str = f3088b;
        }
        return str;
    }
}
