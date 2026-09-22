package ii;

import org.telegram.ui.bj0;
public final class j1 implements Runnable {
    public final int f11453a;
    public final d2 f11454b;

    public j1(d2 d2Var, int i10) {
        this.f11453a = i10;
        this.f11454b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f11453a) {
            case 0:
                this.f11454b.B0();
                return;
            case 1:
                d2 d2Var = this.f11454b;
                if (d2Var.K0 != 0) {
                    d2Var.f11298a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                d2 d2Var2 = this.f11454b;
                if (d2Var2.K0 != 1) {
                    d2Var2.f11308h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                d2 d2Var3 = this.f11454b;
                if (d2Var3.K0 != 2) {
                    d2Var3.f11324v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                d2.V(this.f11454b);
                return;
            case 5:
                d2 d2Var4 = this.f11454b;
                d2Var4.s0(2147483646, 0, true);
                bj0 bj0Var = d2Var4.O0;
                if (bj0Var != null) {
                    bj0Var.h(false);
                    d2Var4.O0 = null;
                    return;
                }
                return;
            default:
                d2 d2Var5 = this.f11454b;
                d2Var5.s0(0, 0, false);
                bj0 bj0Var2 = d2Var5.O0;
                if (bj0Var2 != null) {
                    bj0Var2.h(true);
                    d2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
