package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class ej8 extends k69 {
    public final byte a;
    public final kj8 b;

    public ej8(kj8 kj8Var, byte b) {
        this.a = b;
        this.b = kj8Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        kj8 kj8Var = this.b;
        switch (b) {
            case 0:
                kj8Var.b.invalidate();
                kj8Var.D0();
                return;
            default:
                kj8Var.b.invalidate();
                kj8Var.D0();
                return;
        }
    }
}
