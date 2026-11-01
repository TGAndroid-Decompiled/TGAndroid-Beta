package bi;

import org.telegram.ui.ih0;
public final class o1 implements Runnable {
    public final int f3254a;
    public final k2 f3255b;

    public o1(k2 k2Var, int i10) {
        this.f3254a = i10;
        this.f3255b = k2Var;
    }

    @Override
    public final void run() {
        switch (this.f3254a) {
            case 0:
                this.f3255b.G0();
                return;
            case 1:
                k2 k2Var = this.f3255b;
                if (k2Var.K0 != 0) {
                    k2Var.f3135a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                k2 k2Var2 = this.f3255b;
                if (k2Var2.K0 != 1) {
                    k2Var2.f3145h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                k2 k2Var3 = this.f3255b;
                if (k2Var3.K0 != 2) {
                    k2Var3.f3161v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                k2.a0(this.f3255b);
                return;
            case 5:
                k2 k2Var4 = this.f3255b;
                k2Var4.x0(2147483646, 0, true);
                ih0 ih0Var = k2Var4.O0;
                if (ih0Var != null) {
                    ih0Var.g(false);
                    k2Var4.O0 = null;
                    return;
                }
                return;
            default:
                k2 k2Var5 = this.f3255b;
                k2Var5.x0(0, 0, false);
                ih0 ih0Var2 = k2Var5.O0;
                if (ih0Var2 != null) {
                    ih0Var2.g(true);
                    k2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
