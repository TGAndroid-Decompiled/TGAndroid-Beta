package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class jr4 extends i49 {
    public final byte a;
    public final sr4 b;

    public jr4(sr4 sr4Var, byte b) {
        this.a = b;
        this.b = sr4Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        sr4 sr4Var = this.b;
        switch (b) {
            case 0:
                sr4Var.invalidate();
                return;
            default:
                r7 r7Var = sr4Var.H;
                if (sr4Var.n.J1 && r7Var != null && r7Var.getSearchField() != null) {
                    gl.t1(r7Var.getSearchContainer());
                    return;
                }
                return;
        }
    }
}
