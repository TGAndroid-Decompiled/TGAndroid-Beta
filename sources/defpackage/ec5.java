package defpackage;

import android.view.View;
public final class ec5 implements sq4, fd, nr7 {
    public final byte a;
    public final rc5 b;

    public ec5(rc5 rc5Var, byte b) {
        this.a = b;
        this.b = rc5Var;
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        int i = hl.H0(l2dVar, false).d;
        rc5 rc5Var = this.b;
        rc5Var.n0 = i;
        gb0 gb0Var = rc5Var.G;
        if (gb0Var != null) {
            gb0Var.setPadding(0, 0, 0, i);
        }
        rc5Var.k0();
        rc5Var.i0();
        return l2d.b;
    }

    @Override
    public final void a(int i) {
        rc5 rc5Var = this.b;
        rc5Var.b.a(Math.min(i, rc5Var.d0));
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        rc5 rc5Var = this.b;
        switch (b) {
            case 1:
                rc5Var.r0();
                return;
            default:
                rc5Var.finishFragment();
                return;
        }
    }
}
