package defpackage;
public final class g14 extends yp {
    public final e34 c;

    public g14(e34 e34Var) {
        this.c = e34Var;
    }

    @Override
    public final int i(int i) {
        e34 e34Var = this.c;
        o14 o14Var = e34Var.S;
        f14 f14Var = e34Var.R;
        y59 adapter = e34Var.Q.getAdapter();
        e24 e24Var = e34Var.T;
        if (adapter == e24Var) {
            int d = e24Var.d(i);
            if (d == 1 || d == 3 || d == 2 || d == 4 || d == 5) {
                return f14Var.J;
            }
        } else if ((e34Var.e0 && i == 0) || i == o14Var.d || i == o14Var.c || i == o14Var.f || o14Var.r.indexOfKey(i) >= 0 || o14Var.w.indexOfKey(i) >= 0) {
            return f14Var.J;
        }
        return 1;
    }
}
