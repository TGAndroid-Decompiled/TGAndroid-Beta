package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class uz3 extends r35 {
    public final t14 Q;

    public uz3(t14 t14Var) {
        super(8);
        this.Q = t14Var;
    }

    @Override
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        try {
            gv3 gv3Var = new gv3((byte) 2, recyclerView.getContext(), this);
            gv3Var.a = i;
            v0(gv3Var);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
