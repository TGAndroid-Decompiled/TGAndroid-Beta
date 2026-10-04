package ii;

import org.telegram.ui.zi0;
public final class j1 implements Runnable {
    public final int f12458a;
    public final e2 f12459b;

    public j1(e2 e2Var, int i10) {
        this.f12458a = i10;
        this.f12459b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f12458a) {
            case 0:
                this.f12459b.B0();
                return;
            case 1:
                e2 e2Var = this.f12459b;
                if (e2Var.K0 != 0) {
                    e2Var.f12314a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                e2 e2Var2 = this.f12459b;
                if (e2Var2.K0 != 1) {
                    e2Var2.f12325h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                e2 e2Var3 = this.f12459b;
                if (e2Var3.K0 != 2) {
                    e2Var3.f12341v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                e2.T(this.f12459b);
                return;
            case 5:
                e2 e2Var4 = this.f12459b;
                e2Var4.s0(2147483646, 0, true);
                zi0 zi0Var = e2Var4.O0;
                if (zi0Var != null) {
                    zi0Var.h(false);
                    e2Var4.O0 = null;
                    return;
                }
                return;
            default:
                e2 e2Var5 = this.f12459b;
                e2Var5.s0(0, 0, false);
                zi0 zi0Var2 = e2Var5.O0;
                if (zi0Var2 != null) {
                    zi0Var2.h(true);
                    e2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
