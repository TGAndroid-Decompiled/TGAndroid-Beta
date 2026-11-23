package e2;

import java.util.HashSet;
public abstract class m0 {
    public static final HashSet f10515a = new HashSet();
    public static String f10516b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (m0.class) {
            if (f10515a.add(str)) {
                f10516b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (m0.class) {
            str = f10516b;
        }
        return str;
    }
}
