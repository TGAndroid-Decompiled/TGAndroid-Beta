package b2;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f3084a = new HashSet();
    public static String f3085b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f3084a.add(str)) {
                f3085b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (l0.class) {
            str = f3085b;
        }
        return str;
    }
}
