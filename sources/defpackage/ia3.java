package defpackage;
public abstract class ia3 {
    public static final dd3 a;

    static {
        String str;
        boolean z;
        dd3 dd3Var;
        int i = hdb.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (!z) {
            dd3Var = ha3.w;
        } else {
            xb3 xb3Var = ko3.a;
            kc5 kc5Var = ug6.a;
            kc5 kc5Var2 = kc5Var.e;
            dd3Var = kc5Var;
            if (kc5Var == null) {
                dd3Var = ha3.w;
            }
        }
        a = dd3Var;
    }
}
