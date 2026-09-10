package b2;

import java.util.HashSet;
public abstract class l0 {
    public static final HashSet f1780a = new HashSet();
    public static String f1781b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (l0.class) {
            if (f1780a.add(str)) {
                f1781b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (l0.class) {
            str = f1781b;
        }
        return str;
    }
}
