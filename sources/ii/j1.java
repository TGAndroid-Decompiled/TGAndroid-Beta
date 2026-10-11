package ii;

import org.telegram.ui.cj0;
public final class j1 implements Runnable {
    public final int f12502a;
    public final e2 f12503b;

    public j1(e2 e2Var, int i10) {
        this.f12502a = i10;
        this.f12503b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f12502a) {
            case 0:
                this.f12503b.B0();
                return;
            case 1:
                e2 e2Var = this.f12503b;
                if (e2Var.K0 != 0) {
                    e2Var.f12358a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                e2 e2Var2 = this.f12503b;
                if (e2Var2.K0 != 1) {
                    e2Var2.f12369h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                e2 e2Var3 = this.f12503b;
                if (e2Var3.K0 != 2) {
                    e2Var3.f12385v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                e2.V(this.f12503b);
                return;
            case 5:
                e2 e2Var4 = this.f12503b;
                e2Var4.s0(2147483646, 0, true);
                cj0 cj0Var = e2Var4.O0;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    e2Var4.O0 = null;
                    return;
                }
                return;
            default:
                e2 e2Var5 = this.f12503b;
                e2Var5.s0(0, 0, false);
                cj0 cj0Var2 = e2Var5.O0;
                if (cj0Var2 != null) {
                    cj0Var2.h(true);
                    e2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
