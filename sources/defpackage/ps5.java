package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class ps5 extends v79 {
    public final x46 a;
    public final bt5 b;

    public ps5(bt5 bt5Var, x46 x46Var) {
        this.b = bt5Var;
        this.a = x46Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        bt5 bt5Var = this.b;
        bt5Var.J0();
        if (bt5Var.L1 && !bt5Var.K1) {
            if (bt5Var.M1 - this.a.M0() < 10) {
                bt5Var.F0();
            }
        }
    }
}
