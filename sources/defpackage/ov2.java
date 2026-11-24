package defpackage;

import android.view.ViewGroup;
public final class ov2 extends m8 {
    public final tv2 o;

    public ov2(tv2 tv2Var, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = tv2Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        xv2 xv2Var = this.o.a;
        xv2Var.k = null;
        xv2Var.K = false;
        if (xv2Var.R) {
            xv2Var.b();
        }
    }
}
