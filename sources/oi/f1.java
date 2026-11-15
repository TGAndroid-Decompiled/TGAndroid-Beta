package oi;

import org.telegram.ui.bg0;
public final class f1 implements Runnable {
    public final int f21687a;
    public final z1 f21688b;

    public f1(z1 z1Var, int i7) {
        this.f21687a = i7;
        this.f21688b = z1Var;
    }

    @Override
    public final void run() {
        switch (this.f21687a) {
            case 0:
                this.f21688b.G0();
                return;
            case 1:
                z1 z1Var = this.f21688b;
                if (z1Var.L0 != 0) {
                    z1Var.f22159b0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                z1 z1Var2 = this.f21688b;
                if (z1Var2.L0 != 1) {
                    z1Var2.f22169i0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                z1 z1Var3 = this.f21688b;
                if (z1Var3.L0 != 2) {
                    z1Var3.f22186w0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                z1.a0(this.f21688b);
                return;
            case 5:
                z1 z1Var4 = this.f21688b;
                z1Var4.x0(2147483646, 0, true);
                bg0 bg0Var = z1Var4.P0;
                if (bg0Var != null) {
                    bg0Var.h(false);
                    z1Var4.P0 = null;
                    return;
                }
                return;
            default:
                z1 z1Var5 = this.f21688b;
                z1Var5.x0(0, 0, false);
                bg0 bg0Var2 = z1Var5.P0;
                if (bg0Var2 != null) {
                    bg0Var2.h(true);
                    z1Var5.P0 = null;
                    return;
                }
                return;
        }
    }
}
