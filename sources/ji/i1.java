package ji;

import org.telegram.ui.cj0;
public final class i1 implements Runnable {
    public final int f13977a;
    public final c2 f13978b;

    public i1(c2 c2Var, int i10) {
        this.f13977a = i10;
        this.f13978b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f13977a) {
            case 0:
                this.f13978b.B0();
                return;
            case 1:
                c2 c2Var = this.f13978b;
                if (c2Var.K0 != 0) {
                    c2Var.f13807a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                c2 c2Var2 = this.f13978b;
                if (c2Var2.K0 != 1) {
                    c2Var2.f13818h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                c2 c2Var3 = this.f13978b;
                if (c2Var3.K0 != 2) {
                    c2Var3.f13834v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                c2.V(this.f13978b);
                return;
            case 5:
                c2 c2Var4 = this.f13978b;
                c2Var4.s0(2147483646, 0, true);
                cj0 cj0Var = c2Var4.O0;
                if (cj0Var != null) {
                    cj0Var.h(false);
                    c2Var4.O0 = null;
                    return;
                }
                return;
            default:
                c2 c2Var5 = this.f13978b;
                c2Var5.s0(0, 0, false);
                cj0 cj0Var2 = c2Var5.O0;
                if (cj0Var2 != null) {
                    cj0Var2.h(true);
                    c2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
