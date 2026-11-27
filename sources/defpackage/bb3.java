package defpackage;
public abstract class bb3 {
    public static final vd3 a;

    static {
        String str;
        boolean z;
        vd3 vd3Var;
        int i = chb.a;
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
            vd3Var = ab3.w;
        } else {
            qc3 qc3Var = bp3.a;
            le5 le5Var = zi6.a;
            le5 le5Var2 = le5Var.e;
            vd3Var = le5Var;
            if (le5Var == null) {
                vd3Var = ab3.w;
            }
        }
        a = vd3Var;
    }
}
