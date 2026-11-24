package defpackage;

import android.view.ViewGroup;
public final class yw2 extends m8 {
    public final dx2 o;

    public yw2(dx2 dx2Var, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = dx2Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        hx2 hx2Var = this.o.a;
        hx2Var.k = null;
        hx2Var.K = false;
        if (hx2Var.R) {
            hx2Var.b();
        }
    }
}
