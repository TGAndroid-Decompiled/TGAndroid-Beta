package ji;

import org.telegram.ui.gj0;
public final class i1 implements Runnable {
    public final int f13324a;
    public final d2 f13325b;

    public i1(d2 d2Var, int i10) {
        this.f13324a = i10;
        this.f13325b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f13324a) {
            case 0:
                this.f13325b.B0();
                return;
            case 1:
                d2 d2Var = this.f13325b;
                if (d2Var.K0 != 0) {
                    d2Var.f13201a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                d2 d2Var2 = this.f13325b;
                if (d2Var2.K0 != 1) {
                    d2Var2.f13211h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                d2 d2Var3 = this.f13325b;
                if (d2Var3.K0 != 2) {
                    d2Var3.f13227v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                d2.V(this.f13325b);
                return;
            case 5:
                d2 d2Var4 = this.f13325b;
                d2Var4.s0(2147483646, 0, true);
                gj0 gj0Var = d2Var4.O0;
                if (gj0Var != null) {
                    gj0Var.h(false);
                    d2Var4.O0 = null;
                    return;
                }
                return;
            default:
                d2 d2Var5 = this.f13325b;
                d2Var5.s0(0, 0, false);
                gj0 gj0Var2 = d2Var5.O0;
                if (gj0Var2 != null) {
                    gj0Var2.h(true);
                    d2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
