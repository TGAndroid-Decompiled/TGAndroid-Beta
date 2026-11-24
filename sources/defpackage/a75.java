package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class a75 extends k69 {
    public final g95 a;

    public a75(g95 g95Var) {
        this.a = g95Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        g95 g95Var = this.a;
        g95Var.b.invalidate();
        g95Var.T3.invalidate();
    }
}
