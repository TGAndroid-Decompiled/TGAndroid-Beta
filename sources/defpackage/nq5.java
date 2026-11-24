package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class nq5 extends i49 {
    public final t26 a;
    public final zq5 b;

    public nq5(zq5 zq5Var, t26 t26Var) {
        this.b = zq5Var;
        this.a = t26Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        zq5 zq5Var = this.b;
        zq5Var.I0();
        if (zq5Var.L1 && !zq5Var.K1) {
            if (zq5Var.M1 - this.a.M0() < 10) {
                zq5Var.E0();
            }
        }
    }
}
