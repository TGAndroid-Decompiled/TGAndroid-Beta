package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class iw9 extends r35 {
    public final byte Q;
    public final tx9 R;

    public iw9(tx9 tx9Var, byte b) {
        super(40);
        this.Q = b;
        this.R = tx9Var;
    }

    @Override
    public final void u0(RecyclerView recyclerView, p49 p49Var, int i) {
        switch (this.Q) {
            case 0:
                try {
                    gv3 gv3Var = new gv3((byte) 3, recyclerView.getContext(), this);
                    gv3Var.a = i;
                    v0(gv3Var);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                try {
                    gv3 gv3Var2 = new gv3((byte) 5, recyclerView.getContext(), this);
                    gv3Var2.a = i;
                    v0(gv3Var2);
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
