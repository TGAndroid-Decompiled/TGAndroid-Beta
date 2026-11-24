package defpackage;

import android.view.View;
public final class zi1 implements View.OnClickListener {
    public final byte a;
    public final fj1 b;

    public zi1(fj1 fj1Var, byte b) {
        this.a = b;
        this.b = fj1Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = true;
        fj1 fj1Var = this.b;
        switch (b) {
            case 0:
                fj1Var.h0(view);
                return;
            case 1:
                wn5 wn5Var = fj1Var.x;
                if (fj1Var.E == null) {
                    z = false;
                }
                wn5Var.n(z, new wi1(fj1Var, (byte) 2), new n1(fj1Var, (byte) 11), 0);
                fj1Var.L.H(0);
                fj1Var.L.K(43);
                fj1Var.n.d();
                return;
            case 2:
                if (!fj1Var.l0) {
                    fj1Var.l0();
                    return;
                } else if (fj1Var.c0) {
                    fj1Var.c0 = false;
                    fj1Var.n0();
                    return;
                } else {
                    return;
                }
            default:
                if (!fj1Var.c0) {
                    fj1Var.c0 = true;
                    fj1Var.n0();
                    return;
                }
                return;
        }
    }
}
