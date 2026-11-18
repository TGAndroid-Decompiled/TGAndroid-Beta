package oi;

import org.telegram.ui.eg0;
public final class f1 implements Runnable {
    public final int f22056a;
    public final z1 f22057b;

    public f1(z1 z1Var, int i7) {
        this.f22056a = i7;
        this.f22057b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f22056a) {
            case 0:
                this.f22057b.G0();
                return;
            case 1:
                z1 z1Var = this.f22057b;
                if (z1Var.L0 != 0) {
                    z1Var.f22518b0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                z1 z1Var2 = this.f22057b;
                if (z1Var2.L0 != 1) {
                    z1Var2.f22528i0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                z1 z1Var3 = this.f22057b;
                if (z1Var3.L0 != 2) {
                    z1Var3.f22545w0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                z1.a0(this.f22057b);
                return;
            case 5:
                z1 z1Var4 = this.f22057b;
                z1Var4.x0(2147483646, 0, true);
                eg0 eg0Var = z1Var4.P0;
                if (eg0Var != null) {
                    eg0Var.h(false);
                    z1Var4.P0 = null;
                    return;
                }
                return;
            default:
                z1 z1Var5 = this.f22057b;
                z1Var5.x0(0, 0, false);
                eg0 eg0Var2 = z1Var5.P0;
                if (eg0Var2 != null) {
                    eg0Var2.h(true);
                    z1Var5.P0 = null;
                    return;
                }
                return;
        }
    }
}
