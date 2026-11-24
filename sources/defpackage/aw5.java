package defpackage;

import android.widget.FrameLayout;
public final class aw5 implements xr3 {
    public final byte a;
    public final FrameLayout b;
    public final boolean c;

    public aw5(FrameLayout frameLayout, boolean z, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.c = z;
    }

    @Override
    public final void a(yla ylaVar, boolean z, float f, float f2) {
        byte b = this.a;
        int i = 8;
        boolean z2 = this.c;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                rw5 rw5Var = (rw5) frameLayout;
                ss7 ss7Var = rw5Var.l1;
                if (ylaVar == rw5Var.v1) {
                    rw5Var.v1 = null;
                    if (!z2) {
                        ss7Var.setVisibility(8);
                    }
                    ss7Var.setMaskProvider(null);
                    return;
                }
                return;
            case 1:
                rw5 rw5Var2 = (rw5) frameLayout;
                nw5 nw5Var = rw5Var2.w1;
                if (ylaVar == rw5Var2.C1) {
                    rw5Var2.C1 = null;
                    if (!z2) {
                        nw5Var.setVisibility(8);
                        k38.e(rw5Var2.F1).g();
                        nw5Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            default:
                uz6 uz6Var = (uz6) frameLayout;
                if (!z) {
                    uz6Var.L = null;
                    if (!z2) {
                        i = 0;
                    }
                    uz6Var.setVisibility(i);
                    if (uz6Var.O && z2) {
                        uz6Var.O = false;
                        uz6Var.b.setLayoutManager(uz6Var.getNeededLayoutManager());
                        uz6Var.J = true;
                        uz6Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
