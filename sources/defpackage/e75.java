package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class e75 extends v79 {
    public final j95 a;

    public e75(j95 j95Var) {
        this.a = j95Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        j95 j95Var = this.a;
        j95Var.b.invalidate();
        j95Var.T3.invalidate();
    }
}
