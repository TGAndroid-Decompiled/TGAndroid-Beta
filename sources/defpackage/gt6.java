package defpackage;

import java.util.HashSet;
public abstract class gt6 {
    public static final HashSet a = new HashSet();
    public static String b = "media3.common";

    public static synchronized void a(String str) {
        synchronized (gt6.class) {
            if (a.add(str)) {
                b += ", " + str;
            }
        }
    }

    public static synchronized String b() {
        String str;
        synchronized (gt6.class) {
            str = b;
        }
        return str;
    }
}
