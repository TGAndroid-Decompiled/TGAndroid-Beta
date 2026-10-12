package ji;

import org.telegram.ui.hj0;
public final class i1 implements Runnable {
    public final int f13321a;
    public final d2 f13322b;

    public i1(d2 d2Var, int i10) {
        this.f13321a = i10;
        this.f13322b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f13321a) {
            case 0:
                this.f13322b.B0();
                return;
            case 1:
                d2 d2Var = this.f13322b;
                if (d2Var.K0 != 0) {
                    d2Var.f13197a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                d2 d2Var2 = this.f13322b;
                if (d2Var2.K0 != 1) {
                    d2Var2.f13207h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                d2 d2Var3 = this.f13322b;
                if (d2Var3.K0 != 2) {
                    d2Var3.f13223v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                d2.V(this.f13322b);
                return;
            case 5:
                d2 d2Var4 = this.f13322b;
                d2Var4.s0(2147483646, 0, true);
                hj0 hj0Var = d2Var4.O0;
                if (hj0Var != null) {
                    hj0Var.h(false);
                    d2Var4.O0 = null;
                    return;
                }
                return;
            default:
                d2 d2Var5 = this.f13322b;
                d2Var5.s0(0, 0, false);
                hj0 hj0Var2 = d2Var5.O0;
                if (hj0Var2 != null) {
                    hj0Var2.h(true);
                    d2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
