package e2;

import java.util.HashSet;
public abstract class m0 {
    public static final HashSet f10552a = new HashSet();
    public static String f10553b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (m0.class) {
            if (f10552a.add(str)) {
                f10553b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (m0.class) {
            str = f10553b;
        }
        return str;
    }
}
