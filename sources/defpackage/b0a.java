package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class b0a extends u55 {
    public final byte Q;
    public final n1a R;

    public b0a(n1a n1aVar, byte b) {
        super(40);
        this.Q = b;
        this.R = n1aVar;
    }

    @Override
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        switch (this.Q) {
            case 0:
                try {
                    aw3 aw3Var = new aw3((byte) 3, recyclerView.getContext(), this);
                    aw3Var.a = i;
                    v0(aw3Var);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                try {
                    aw3 aw3Var2 = new aw3((byte) 5, recyclerView.getContext(), this);
                    aw3Var2.a = i;
                    v0(aw3Var2);
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }
}
