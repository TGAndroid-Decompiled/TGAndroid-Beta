package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class p04 extends u55 {
    public final o24 Q;

    public p04(o24 o24Var) {
        super(8);
        this.Q = o24Var;
    }

    @Override
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        try {
            aw3 aw3Var = new aw3((byte) 2, recyclerView.getContext(), this);
            aw3Var.a = i;
            v0(aw3Var);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
