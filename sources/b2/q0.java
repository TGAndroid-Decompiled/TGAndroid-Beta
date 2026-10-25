package b2;

import java.util.HashSet;
public abstract class q0 {
    public static final HashSet f3354a = new HashSet();
    public static String f3355b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (q0.class) {
            if (f3354a.add(str)) {
                f3355b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (q0.class) {
            str = f3355b;
        }
        return str;
    }
}
