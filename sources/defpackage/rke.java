package defpackage;

import java.util.Collections;
import java.util.Map;
public final class rke {
    public static volatile rke a;
    public static volatile rke b;
    public static final rke c;

    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        c = obj;
    }

    public static void a() {
        if (a == null) {
            synchronized (rke.class) {
                if (a == null) {
                    a = c;
                }
            }
        }
    }
}
