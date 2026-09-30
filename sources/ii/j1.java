package ii;

import org.telegram.ui.vi0;
public final class j1 implements Runnable {
    public final int f11448a;
    public final e2 f11449b;

    public j1(e2 e2Var, int i10) {
        this.f11448a = i10;
        this.f11449b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f11448a) {
            case 0:
                this.f11449b.B0();
                return;
            case 1:
                e2 e2Var = this.f11449b;
                if (e2Var.K0 != 0) {
                    e2Var.f11308a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                e2 e2Var2 = this.f11449b;
                if (e2Var2.K0 != 1) {
                    e2Var2.f11318h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                e2 e2Var3 = this.f11449b;
                if (e2Var3.K0 != 2) {
                    e2Var3.f11334v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                e2.V(this.f11449b);
                return;
            case 5:
                e2 e2Var4 = this.f11449b;
                e2Var4.s0(2147483646, 0, true);
                vi0 vi0Var = e2Var4.O0;
                if (vi0Var != null) {
                    vi0Var.h(false);
                    e2Var4.O0 = null;
                    return;
                }
                return;
            default:
                e2 e2Var5 = this.f11449b;
                e2Var5.s0(0, 0, false);
                vi0 vi0Var2 = e2Var5.O0;
                if (vi0Var2 != null) {
                    vi0Var2.h(true);
                    e2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
