package ii;

import org.telegram.ui.yi0;
public final class j1 implements Runnable {
    public final int f11451a;
    public final e2 f11452b;

    public j1(e2 e2Var, int i10) {
        this.f11451a = i10;
        this.f11452b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f11451a) {
            case 0:
                this.f11452b.B0();
                return;
            case 1:
                e2 e2Var = this.f11452b;
                if (e2Var.K0 != 0) {
                    e2Var.f11311a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                e2 e2Var2 = this.f11452b;
                if (e2Var2.K0 != 1) {
                    e2Var2.f11321h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                e2 e2Var3 = this.f11452b;
                if (e2Var3.K0 != 2) {
                    e2Var3.f11337v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                e2.V(this.f11452b);
                return;
            case 5:
                e2 e2Var4 = this.f11452b;
                e2Var4.s0(2147483646, 0, true);
                yi0 yi0Var = e2Var4.O0;
                if (yi0Var != null) {
                    yi0Var.h(false);
                    e2Var4.O0 = null;
                    return;
                }
                return;
            default:
                e2 e2Var5 = this.f11452b;
                e2Var5.s0(0, 0, false);
                yi0 yi0Var2 = e2Var5.O0;
                if (yi0Var2 != null) {
                    yi0Var2.h(true);
                    e2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
