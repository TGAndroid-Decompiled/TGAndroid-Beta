package b2;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f2138a = new HashSet();
    public static String f2139b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f2138a.add(str)) {
                f2139b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (l0.class) {
            str = f2139b;
        }
        return str;
    }
}
