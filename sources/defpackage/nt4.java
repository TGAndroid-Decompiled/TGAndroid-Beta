package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class nt4 extends v79 {
    public final byte a;
    public final wt4 b;

    public nt4(wt4 wt4Var, byte b) {
        this.a = b;
        this.b = wt4Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        wt4 wt4Var = this.b;
        switch (b) {
            case 0:
                wt4Var.invalidate();
                return;
            default:
                s7 s7Var = wt4Var.H;
                if (wt4Var.n.J1 && s7Var != null && s7Var.getSearchField() != null) {
                    hl.t1(s7Var.getSearchContainer());
                    return;
                }
                return;
        }
    }
}
