package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class ls5 extends k69 {
    public final u46 a;
    public final xs5 b;

    public ls5(xs5 xs5Var, u46 u46Var) {
        this.b = xs5Var;
        this.a = u46Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        xs5 xs5Var = this.b;
        xs5Var.I0();
        if (xs5Var.L1 && !xs5Var.K1) {
            if (xs5Var.M1 - this.a.M0() < 10) {
                xs5Var.E0();
            }
        }
    }
}
