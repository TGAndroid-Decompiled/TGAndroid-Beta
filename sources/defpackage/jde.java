package defpackage;
public abstract class jde {
    public static final Object a(long j, fw2 fw2Var) {
        if (j > 0) {
            na1 na1Var = new na1(1, dle.a(fw2Var));
            na1Var.s();
            if (j < Long.MAX_VALUE) {
                b(na1Var.e).b(j, na1Var);
            }
            Object q = na1Var.q();
            if (q == bx2.a) {
                return q;
            }
        }
        return g5c.a;
    }

    public static final dd3 b(sw2 sw2Var) {
        dd3 dd3Var;
        qw2 qw2Var = sw2Var.get(vi2.b);
        if (qw2Var instanceof dd3) {
            dd3Var = (dd3) qw2Var;
        } else {
            dd3Var = null;
        }
        if (dd3Var == null) {
            return ia3.a;
        }
        return dd3Var;
    }
}
