package e2;

import java.util.HashSet;
public abstract class m0 {
    public static final HashSet f10520a = new HashSet();
    public static String f10521b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (m0.class) {
            if (f10520a.add(str)) {
                f10521b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (m0.class) {
            str = f10521b;
        }
        return str;
    }
}
