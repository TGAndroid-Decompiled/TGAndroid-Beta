package d2;

import java.util.HashSet;
public abstract class o0 {
    public static final HashSet f8248a = new HashSet();
    public static String f8249b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (o0.class) {
            if (f8248a.add(str)) {
                f8249b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (o0.class) {
            str = f8249b;
        }
        return str;
    }
}
