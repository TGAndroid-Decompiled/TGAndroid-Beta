package ki;

import org.telegram.ui.mi0;
public final class i1 implements Runnable {
    public final int f15327a;
    public final d2 f15328b;

    public i1(d2 d2Var, int i10) {
        this.f15327a = i10;
        this.f15328b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f15327a) {
            case 0:
                this.f15328b.B0();
                return;
            case 1:
                d2 d2Var = this.f15328b;
                if (d2Var.K0 != 0) {
                    d2Var.f15197a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                d2 d2Var2 = this.f15328b;
                if (d2Var2.K0 != 1) {
                    d2Var2.f15207h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                d2 d2Var3 = this.f15328b;
                if (d2Var3.K0 != 2) {
                    d2Var3.f15223v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                d2.V(this.f15328b);
                return;
            case 5:
                d2 d2Var4 = this.f15328b;
                d2Var4.s0(2147483646, 0, true);
                mi0 mi0Var = d2Var4.O0;
                if (mi0Var != null) {
                    mi0Var.h(false);
                    d2Var4.O0 = null;
                    return;
                }
                return;
            default:
                d2 d2Var5 = this.f15328b;
                d2Var5.s0(0, 0, false);
                mi0 mi0Var2 = d2Var5.O0;
                if (mi0Var2 != null) {
                    mi0Var2.h(true);
                    d2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
