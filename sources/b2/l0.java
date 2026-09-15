package b2;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f3082a = new HashSet();
    public static String f3083b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f3082a.add(str)) {
                f3083b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (l0.class) {
            str = f3083b;
        }
        return str;
    }
}
