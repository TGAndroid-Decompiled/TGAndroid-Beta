package defpackage;

import java.util.Collections;
import java.util.Map;
public final class k84 {
    public static volatile k84 a;
    public static final k84 b;

    static {
        ?? obj = new Object();
        Map map = Collections.EMPTY_MAP;
        b = obj;
    }

    public static k84 a() {
        k84 k84Var;
        gv8 gv8Var = gv8.c;
        k84 k84Var2 = a;
        if (k84Var2 == null) {
            synchronized (k84.class) {
                k84Var = a;
                if (k84Var == null) {
                    Class cls = j84.a;
                    k84 k84Var3 = null;
                    if (cls != null) {
                        try {
                            k84Var3 = (k84) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    if (k84Var3 != null) {
                        k84Var = k84Var3;
                    } else {
                        k84Var = b;
                    }
                    a = k84Var;
                }
            }
            return k84Var;
        }
        return k84Var2;
    }
}
