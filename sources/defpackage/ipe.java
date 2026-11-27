package defpackage;

import java.util.Collections;
import java.util.Map;
public final class ipe {
    public static volatile ipe a;
    public static volatile ipe b;
    public static final ipe c;

    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        c = obj;
    }

    public static void a() {
        if (a == null) {
            synchronized (ipe.class) {
                if (a == null) {
                    a = c;
                }
            }
        }
    }
}
