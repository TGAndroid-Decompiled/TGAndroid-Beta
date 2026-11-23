package oi;

import org.telegram.ui.dg0;
public final class g1 implements Runnable {
    public final int f22208a;
    public final b2 f22209b;

    public g1(b2 b2Var, int i7) {
        this.f22208a = i7;
        this.f22209b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f22208a) {
            case 0:
                this.f22209b.G0();
                return;
            case 1:
                b2 b2Var = this.f22209b;
                if (b2Var.L0 != 0) {
                    b2Var.f22057b0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                b2 b2Var2 = this.f22209b;
                if (b2Var2.L0 != 1) {
                    b2Var2.f22067i0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                b2 b2Var3 = this.f22209b;
                if (b2Var3.L0 != 2) {
                    b2Var3.f22084w0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                b2.a0(this.f22209b);
                return;
            case 5:
                b2 b2Var4 = this.f22209b;
                b2Var4.x0(2147483646, 0, true);
                dg0 dg0Var = b2Var4.P0;
                if (dg0Var != null) {
                    dg0Var.h(false);
                    b2Var4.P0 = null;
                    return;
                }
                return;
            default:
                b2 b2Var5 = this.f22209b;
                b2Var5.x0(0, 0, false);
                dg0 dg0Var2 = b2Var5.P0;
                if (dg0Var2 != null) {
                    dg0Var2.h(true);
                    b2Var5.P0 = null;
                    return;
                }
                return;
        }
    }
}
