package defpackage;
public abstract class fze {
    public static final Object a(ss9 ss9Var, ss9 ss9Var2, fs4 fs4Var) {
        Object qq2Var;
        Object C;
        try {
            r5c.a(2, fs4Var);
            qq2Var = fs4Var.invoke(ss9Var2, ss9Var);
        } catch (Throwable th) {
            qq2Var = new qq2(th, false);
        }
        ly2 ly2Var = ly2.a;
        if (qq2Var != ly2Var && (C = ss9Var.C(qq2Var)) != hcd.b) {
            if (!(C instanceof qq2)) {
                return hcd.a(C);
            }
            throw ((qq2) C).a;
        }
        return ly2Var;
    }
}
