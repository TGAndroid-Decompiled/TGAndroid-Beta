package defpackage;

import android.view.ViewGroup;
public final class iw2 extends n8 {
    public final nw2 o;

    public iw2(nw2 nw2Var, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.o = nw2Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        rw2 rw2Var = this.o.a;
        rw2Var.k = null;
        rw2Var.K = false;
        if (rw2Var.R) {
            rw2Var.b();
        }
    }
}
