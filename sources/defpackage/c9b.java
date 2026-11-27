package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class c9b extends v79 {
    public final e9b a;

    public c9b(e9b e9bVar) {
        this.a = e9bVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        this.a.b.invalidate();
    }
}
