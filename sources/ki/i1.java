package ki;

import org.telegram.ui.qi0;
public final class i1 implements Runnable {
    public final int f15387a;
    public final d2 f15388b;

    public i1(d2 d2Var, int i10) {
        this.f15387a = i10;
        this.f15388b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f15387a) {
            case 0:
                this.f15388b.B0();
                return;
            case 1:
                d2 d2Var = this.f15388b;
                if (d2Var.K0 != 0) {
                    d2Var.f15255a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                d2 d2Var2 = this.f15388b;
                if (d2Var2.K0 != 1) {
                    d2Var2.f15265h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                d2 d2Var3 = this.f15388b;
                if (d2Var3.K0 != 2) {
                    d2Var3.f15281v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                d2.V(this.f15388b);
                return;
            case 5:
                d2 d2Var4 = this.f15388b;
                d2Var4.s0(2147483646, 0, true);
                qi0 qi0Var = d2Var4.O0;
                if (qi0Var != null) {
                    qi0Var.g(false);
                    d2Var4.O0 = null;
                    return;
                }
                return;
            default:
                d2 d2Var5 = this.f15388b;
                d2Var5.s0(0, 0, false);
                qi0 qi0Var2 = d2Var5.O0;
                if (qi0Var2 != null) {
                    qi0Var2.g(true);
                    d2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
