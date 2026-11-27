package defpackage;

import android.widget.FrameLayout;
public final class fy5 implements ps3 {
    public final byte a;
    public final FrameLayout b;
    public final boolean c;

    public fy5(FrameLayout frameLayout, boolean z, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.c = z;
    }

    @Override
    public final void a(vpa vpaVar, boolean z, float f, float f2) {
        byte b = this.a;
        int i = 8;
        boolean z2 = this.c;
        FrameLayout frameLayout = this.b;
        switch (b) {
            case 0:
                wy5 wy5Var = (wy5) frameLayout;
                zv7 zv7Var = wy5Var.f1;
                if (vpaVar == wy5Var.p1) {
                    wy5Var.p1 = null;
                    if (!z2) {
                        zv7Var.setVisibility(8);
                    }
                    zv7Var.setMaskProvider(null);
                    return;
                }
                return;
            case 1:
                wy5 wy5Var2 = (wy5) frameLayout;
                sy5 sy5Var = wy5Var2.q1;
                if (vpaVar == wy5Var2.w1) {
                    wy5Var2.w1 = null;
                    if (!z2) {
                        sy5Var.setVisibility(8);
                        a78.e(wy5Var2.z1).g();
                        sy5Var.getAdapter().f();
                        return;
                    }
                    return;
                }
                return;
            default:
                b27 b27Var = (b27) frameLayout;
                if (!z) {
                    b27Var.L = null;
                    if (!z2) {
                        i = 0;
                    }
                    b27Var.setVisibility(i);
                    if (b27Var.O && z2) {
                        b27Var.O = false;
                        b27Var.b.setLayoutManager(b27Var.getNeededLayoutManager());
                        b27Var.J = true;
                        b27Var.o(true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
