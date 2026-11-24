package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class f14 extends q55 {
    public final e34 Q;

    public f14(e34 e34Var) {
        super(8);
        this.Q = e34Var;
    }

    @Override
    public final void u0(RecyclerView recyclerView, r69 r69Var, int i) {
        try {
            rw3 rw3Var = new rw3((byte) 2, recyclerView.getContext(), this);
            rw3Var.a = i;
            v0(rw3Var);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
