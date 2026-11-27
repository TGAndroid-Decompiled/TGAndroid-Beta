package defpackage;

import android.view.View;
public final class ai1 implements View.OnClickListener {
    public final byte a;
    public final gi1 b;

    public ai1(gi1 gi1Var, byte b) {
        this.a = b;
        this.b = gi1Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = true;
        gi1 gi1Var = this.b;
        switch (b) {
            case 0:
                gi1Var.g0(view);
                return;
            case 1:
                zn5 zn5Var = gi1Var.x;
                if (gi1Var.E == null) {
                    z = false;
                }
                zn5Var.n(z, new xh1(gi1Var, (byte) 2), new o1(gi1Var, (byte) 11), 0);
                gi1Var.L.H(0);
                gi1Var.L.K(43);
                gi1Var.n.d();
                return;
            case 2:
                if (!gi1Var.l0) {
                    gi1Var.k0();
                    return;
                } else if (gi1Var.c0) {
                    gi1Var.c0 = false;
                    gi1Var.m0();
                    return;
                } else {
                    return;
                }
            default:
                if (!gi1Var.c0) {
                    gi1Var.c0 = true;
                    gi1Var.m0();
                    return;
                }
                return;
        }
    }
}
