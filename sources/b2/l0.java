package b2;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f2165a = new HashSet();
    public static String f2166b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f2165a.add(str)) {
                f2166b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (l0.class) {
            str = f2166b;
        }
        return str;
    }
}
