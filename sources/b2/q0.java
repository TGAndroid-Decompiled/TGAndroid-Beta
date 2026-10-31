package b2;

import java.util.HashSet;
public abstract class q0 {
    public static final HashSet f2193a = new HashSet();
    public static String f2194b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (q0.class) {
            if (f2193a.add(str)) {
                f2194b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (q0.class) {
            str = f2194b;
        }
        return str;
    }
}
