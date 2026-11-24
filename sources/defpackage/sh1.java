package defpackage;

import android.view.View;
public final class sh1 implements View.OnClickListener {
    public final byte a;
    public final yh1 b;

    public sh1(yh1 yh1Var, byte b) {
        this.a = b;
        this.b = yh1Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        boolean z = true;
        yh1 yh1Var = this.b;
        switch (b) {
            case 0:
                yh1Var.g0(view);
                return;
            case 1:
                wl5 wl5Var = yh1Var.x;
                if (yh1Var.E == null) {
                    z = false;
                }
                wl5Var.n(z, new oh1(yh1Var, (byte) 2), new n1(yh1Var, (byte) 11), 0);
                yh1Var.L.H(0);
                yh1Var.L.K(43);
                yh1Var.n.d();
                return;
            case 2:
                if (!yh1Var.l0) {
                    yh1Var.k0();
                    return;
                } else if (yh1Var.c0) {
                    yh1Var.c0 = false;
                    yh1Var.m0();
                    return;
                } else {
                    return;
                }
            default:
                if (!yh1Var.c0) {
                    yh1Var.c0 = true;
                    yh1Var.m0();
                    return;
                }
                return;
        }
    }
}
