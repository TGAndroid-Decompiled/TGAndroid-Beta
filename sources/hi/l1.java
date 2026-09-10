package hi;

import org.telegram.ui.cj0;
public final class l1 implements Runnable {
    public final int f9719a;
    public final g2 f9720b;

    public l1(g2 g2Var, int i10) {
        this.f9719a = i10;
        this.f9720b = g2Var;
    }

    @Override
    public final void run() {
        switch (this.f9719a) {
            case 0:
                this.f9720b.B0();
                return;
            case 1:
                g2 g2Var = this.f9720b;
                if (g2Var.K0 != 0) {
                    g2Var.f9580a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                g2 g2Var2 = this.f9720b;
                if (g2Var2.K0 != 1) {
                    g2Var2.f9590h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                g2 g2Var3 = this.f9720b;
                if (g2Var3.K0 != 2) {
                    g2Var3.f9606v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                g2.V(this.f9720b);
                return;
            case 5:
                g2 g2Var4 = this.f9720b;
                g2Var4.s0(2147483646, 0, true);
                cj0 cj0Var = g2Var4.O0;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    g2Var4.O0 = null;
                    return;
                }
                return;
            default:
                g2 g2Var5 = this.f9720b;
                g2Var5.s0(0, 0, false);
                cj0 cj0Var2 = g2Var5.O0;
                if (cj0Var2 != null) {
                    cj0Var2.h(true);
                    g2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
