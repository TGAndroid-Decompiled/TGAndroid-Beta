package b2;

import java.util.HashSet;
public abstract class p0 {
    public static final HashSet f3896a = new HashSet();
    public static String f3897b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (p0.class) {
            if (f3896a.add(str)) {
                f3897b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (p0.class) {
            str = f3897b;
        }
        return str;
    }
}
