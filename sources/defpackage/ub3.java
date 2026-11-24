package defpackage;
public abstract class ub3 {
    public static final pe3 a;

    static {
        String str;
        boolean z;
        pe3 pe3Var;
        int i = ifb.a;
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
            pe3Var = tb3.w;
        } else {
            jd3 jd3Var = up3.a;
            ie5 ie5Var = vi6.a;
            ie5 ie5Var2 = ie5Var.e;
            pe3Var = ie5Var;
            if (ie5Var == null) {
                pe3Var = tb3.w;
            }
        }
        a = pe3Var;
    }
}
