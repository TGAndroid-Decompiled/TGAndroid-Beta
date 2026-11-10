package e2;

import java.util.HashSet;
public abstract class m0 {
    public static final HashSet f10374a = new HashSet();
    public static String f10375b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (m0.class) {
            if (f10374a.add(str)) {
                f10375b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (m0.class) {
            str = f10375b;
        }
        return str;
    }
}
