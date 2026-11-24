package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class e5b extends i49 {
    public final g5b a;

    public e5b(g5b g5bVar) {
        this.a = g5bVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.a.b.invalidate();
    }
}
