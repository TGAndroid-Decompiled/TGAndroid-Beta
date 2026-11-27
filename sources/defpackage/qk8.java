package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class qk8 extends v79 {
    public final byte a;
    public final xk8 b;

    public qk8(xk8 xk8Var, byte b) {
        this.a = b;
        this.b = xk8Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        byte b = this.a;
        xk8 xk8Var = this.b;
        switch (b) {
            case 0:
                xk8Var.b.invalidate();
                xk8Var.E0();
                return;
            default:
                xk8Var.b.invalidate();
                xk8Var.E0();
                return;
        }
    }
}
