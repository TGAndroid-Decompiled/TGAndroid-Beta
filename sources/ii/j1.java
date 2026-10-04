package ii;

import org.telegram.ui.zi0;
public final class j1 implements Runnable {
    public final int f12457a;
    public final e2 f12458b;

    public j1(e2 e2Var, int i10) {
        this.f12457a = i10;
        this.f12458b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f12457a) {
            case 0:
                this.f12458b.B0();
                return;
            case 1:
                e2 e2Var = this.f12458b;
                if (e2Var.K0 != 0) {
                    e2Var.f12313a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                e2 e2Var2 = this.f12458b;
                if (e2Var2.K0 != 1) {
                    e2Var2.f12324h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                e2 e2Var3 = this.f12458b;
                if (e2Var3.K0 != 2) {
                    e2Var3.f12340v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                e2.T(this.f12458b);
                return;
            case 5:
                e2 e2Var4 = this.f12458b;
                e2Var4.s0(2147483646, 0, true);
                zi0 zi0Var = e2Var4.O0;
                if (zi0Var != null) {
                    zi0Var.h(false);
                    e2Var4.O0 = null;
                    return;
                }
                return;
            default:
                e2 e2Var5 = this.f12458b;
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
