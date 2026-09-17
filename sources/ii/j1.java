package ii;

import org.telegram.ui.dj0;
public final class j1 implements Runnable {
    public final int f11454a;
    public final d2 f11455b;

    public j1(d2 d2Var, int i10) {
        this.f11454a = i10;
        this.f11455b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f11454a) {
            case 0:
                this.f11455b.B0();
                return;
            case 1:
                d2 d2Var = this.f11455b;
                if (d2Var.K0 != 0) {
                    d2Var.f11299a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                d2 d2Var2 = this.f11455b;
                if (d2Var2.K0 != 1) {
                    d2Var2.f11309h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                d2 d2Var3 = this.f11455b;
                if (d2Var3.K0 != 2) {
                    d2Var3.f11325v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                d2.V(this.f11455b);
                return;
            case 5:
                d2 d2Var4 = this.f11455b;
                d2Var4.s0(2147483646, 0, true);
                dj0 dj0Var = d2Var4.O0;
                if (dj0Var != null) {
                    dj0Var.h(false);
                    d2Var4.O0 = null;
                    return;
                }
                return;
            default:
                d2 d2Var5 = this.f11455b;
                d2Var5.s0(0, 0, false);
                dj0 dj0Var2 = d2Var5.O0;
                if (dj0Var2 != null) {
                    dj0Var2.h(true);
                    d2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
