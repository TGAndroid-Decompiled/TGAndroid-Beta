package defpackage;

import java.util.Collections;
import java.util.Map;
public final class b74 {
    public static volatile b74 a;
    public static final b74 b;

    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static b74 a() {
        b74 b74Var;
        ft8 ft8Var = ft8.c;
        b74 b74Var2 = a;
        if (b74Var2 == null) {
            synchronized (b74.class) {
                b74Var = a;
                if (b74Var == null) {
                    Class cls = a74.a;
                    b74 b74Var3 = null;
                    if (cls != null) {
                        try {
                            b74Var3 = (b74) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    if (b74Var3 != null) {
                        b74Var = b74Var3;
                    } else {
                        b74Var = b;
                    }
                    a = b74Var;
                }
            }
            return b74Var;
        }
        return b74Var2;
    }
}
