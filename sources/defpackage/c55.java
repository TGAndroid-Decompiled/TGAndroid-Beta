package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class c55 extends i49 {
    public final h75 a;

    public c55(h75 h75Var) {
        this.a = h75Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        h75 h75Var = this.a;
        h75Var.b.invalidate();
        h75Var.T3.invalidate();
    }
}
