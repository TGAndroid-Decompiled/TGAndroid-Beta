package defpackage;

import java.util.Collections;
import java.util.Map;
public final class tme {
    public static volatile tme a;
    public static volatile tme b;
    public static final tme c;

    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        c = obj;
    }

    public static void a() {
        if (a == null) {
            synchronized (tme.class) {
                if (a == null) {
                    a = c;
                }
            }
        }
    }
}
