package ii;

import org.telegram.ui.dj0;
public final class j1 implements Runnable {
    public final int f12503a;
    public final e2 f12504b;

    public j1(e2 e2Var, int i10) {
        this.f12503a = i10;
        this.f12504b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f12503a) {
            case 0:
                this.f12504b.B0();
                return;
            case 1:
                e2 e2Var = this.f12504b;
                if (e2Var.K0 != 0) {
                    e2Var.f12359a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                e2 e2Var2 = this.f12504b;
                if (e2Var2.K0 != 1) {
                    e2Var2.f12370h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                e2 e2Var3 = this.f12504b;
                if (e2Var3.K0 != 2) {
                    e2Var3.f12386v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                e2.V(this.f12504b);
                return;
            case 5:
                e2 e2Var4 = this.f12504b;
                e2Var4.s0(2147483646, 0, true);
                dj0 dj0Var = e2Var4.O0;
                if (dj0Var != null) {
                    dj0Var.h(false);
                    e2Var4.O0 = null;
                    return;
                }
                return;
            default:
                e2 e2Var5 = this.f12504b;
                e2Var5.s0(0, 0, false);
                dj0 dj0Var2 = e2Var5.O0;
                if (dj0Var2 != null) {
                    dj0Var2.h(true);
                    e2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
