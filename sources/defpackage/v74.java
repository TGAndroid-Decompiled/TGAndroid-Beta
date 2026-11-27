package defpackage;

import java.util.Collections;
import java.util.Map;
public final class v74 {
    public static volatile v74 a;
    public static final v74 b;

    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static v74 a() {
        v74 v74Var;
        ow8 ow8Var = ow8.c;
        v74 v74Var2 = a;
        if (v74Var2 == null) {
            synchronized (v74.class) {
                v74Var = a;
                if (v74Var == null) {
                    Class cls = u74.a;
                    v74 v74Var3 = null;
                    if (cls != null) {
                        try {
                            v74Var3 = (v74) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    if (v74Var3 != null) {
                        v74Var = v74Var3;
                    } else {
                        v74Var = b;
                    }
                    a = v74Var;
                }
            }
            return v74Var;
        }
        return v74Var2;
    }
}
