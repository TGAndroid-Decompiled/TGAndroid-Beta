package b2;

import java.util.HashSet;
public abstract class q0 {
    public static final HashSet f2291a = new HashSet();
    public static String f2292b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (q0.class) {
            if (f2291a.add(str)) {
                f2292b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (q0.class) {
            str = f2292b;
        }
        return str;
    }
}
