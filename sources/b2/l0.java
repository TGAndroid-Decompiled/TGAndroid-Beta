package b2;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f3411a = new HashSet();
    public static String f3412b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f3411a.add(str)) {
                f3412b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (l0.class) {
            str = f3412b;
        }
        return str;
    }
}
