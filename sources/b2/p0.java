package b2;

import java.util.HashSet;
public abstract class p0 {
    public static final HashSet f3898a = new HashSet();
    public static String f3899b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (p0.class) {
            if (f3898a.add(str)) {
                f3899b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (p0.class) {
            str = f3899b;
        }
        return str;
    }
}
