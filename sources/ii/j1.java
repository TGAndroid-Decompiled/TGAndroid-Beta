package ii;

import org.telegram.ui.ej0;
public final class j1 implements Runnable {
    public final int f12512a;
    public final e2 f12513b;

    public j1(e2 e2Var, int i10) {
        this.f12512a = i10;
        this.f12513b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f12512a) {
            case 0:
                this.f12513b.B0();
                return;
            case 1:
                e2 e2Var = this.f12513b;
                if (e2Var.K0 != 0) {
                    e2Var.f12361a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                e2 e2Var2 = this.f12513b;
                if (e2Var2.K0 != 1) {
                    e2Var2.f12372h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                e2 e2Var3 = this.f12513b;
                if (e2Var3.K0 != 2) {
                    e2Var3.f12388v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                e2.V(this.f12513b);
                return;
            case 5:
                e2 e2Var4 = this.f12513b;
                e2Var4.s0(2147483646, 0, true);
                ej0 ej0Var = e2Var4.O0;
                if (ej0Var != null) {
                    ej0Var.h(false);
                    e2Var4.O0 = null;
                    return;
                }
                return;
            default:
                e2 e2Var5 = this.f12513b;
                e2Var5.s0(0, 0, false);
                ej0 ej0Var2 = e2Var5.O0;
                if (ej0Var2 != null) {
                    ej0Var2.h(true);
                    e2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
