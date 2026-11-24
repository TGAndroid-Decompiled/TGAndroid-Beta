package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class ch8 extends i49 {
    public final byte a;
    public final jh8 b;

    public ch8(jh8 jh8Var, byte b) {
        this.a = b;
        this.b = jh8Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        jh8 jh8Var = this.b;
        switch (b) {
            case 0:
                jh8Var.b.invalidate();
                jh8Var.D0();
                return;
            default:
                jh8Var.b.invalidate();
                jh8Var.D0();
                return;
        }
    }
}
