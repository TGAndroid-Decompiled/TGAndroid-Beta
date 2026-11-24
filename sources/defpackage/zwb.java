package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class zwb extends i49 {
    public final byte a;
    public final kxb b;

    public zwb(kxb kxbVar, byte b) {
        this.a = b;
        this.b = kxbVar;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        kxb kxbVar = this.b;
        switch (b) {
            case 0:
                if (kxbVar.i()) {
                    kxbVar.j();
                    return;
                }
                return;
            default:
                if (kxbVar.i()) {
                    kxbVar.j();
                    return;
                }
                return;
        }
    }
}
