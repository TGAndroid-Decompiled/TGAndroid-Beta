package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class o65 extends k69 {
    public final g95 a;

    public o65(g95 g95Var) {
        this.a = g95Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.a.b.invalidate();
    }
}
