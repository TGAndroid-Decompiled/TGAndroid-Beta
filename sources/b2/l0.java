package b2;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f3332a = new HashSet();
    public static String f3333b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f3332a.add(str)) {
                f3333b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (l0.class) {
            str = f3333b;
        }
        return str;
    }
}
