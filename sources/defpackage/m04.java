package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class m04 extends q55 {
    public final e34 Q;

    public m04(e34 e34Var) {
        super(5);
        this.Q = e34Var;
    }

    @Override
    public final int n0(int i, ki2 ki2Var, r69 r69Var) {
        int n0 = super.n0(i, ki2Var, r69Var);
        e34 e34Var = this.Q;
        if (n0 != 0 && e34Var.E0.getScrollState() == 1) {
            e34Var.Y1 = false;
            e34Var.Z();
        }
        if (e34Var.U0 == null) {
            w04 w04Var = new w04(e34Var, e34Var.d1, e34Var.u1.a(), e34Var.u1.f(), (byte) 0);
            e34Var.U0 = w04Var;
            w04Var.a();
        }
        e34Var.U0.b();
        return n0;
    }

    @Override
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        try {
            w46 w46Var = new w46(recyclerView.getContext(), 2);
            w46Var.a = i;
            v0(w46Var);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
