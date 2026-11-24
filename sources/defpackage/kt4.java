package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class kt4 extends k69 {
    public final byte a;
    public final tt4 b;

    public kt4(tt4 tt4Var, byte b) {
        this.a = b;
        this.b = tt4Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        tt4 tt4Var = this.b;
        switch (b) {
            case 0:
                tt4Var.invalidate();
                return;
            default:
                r7 r7Var = tt4Var.H;
                if (tt4Var.n.J1 && r7Var != null && r7Var.getSearchField() != null) {
                    gm.t1(r7Var.getSearchContainer());
                    return;
                }
                return;
        }
    }
}
