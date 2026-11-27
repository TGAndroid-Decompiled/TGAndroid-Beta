package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class a1c extends v79 {
    public final byte a;
    public final l1c b;

    public a1c(l1c l1cVar, byte b) {
        this.a = b;
        this.b = l1cVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        l1c l1cVar = this.b;
        switch (b) {
            case 0:
                if (l1cVar.i()) {
                    l1cVar.j();
                    return;
                }
                return;
            default:
                if (l1cVar.i()) {
                    l1cVar.j();
                    return;
                }
                return;
        }
    }
}
