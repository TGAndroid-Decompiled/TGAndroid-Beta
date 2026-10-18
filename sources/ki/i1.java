package ki;

import org.telegram.ui.ni0;
public final class i1 implements Runnable {
    public final int f15326a;
    public final d2 f15327b;

    public i1(d2 d2Var, int i10) {
        this.f15326a = i10;
        this.f15327b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f15326a) {
            case 0:
                this.f15327b.B0();
                return;
            case 1:
                d2 d2Var = this.f15327b;
                if (d2Var.K0 != 0) {
                    d2Var.f15196a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                d2 d2Var2 = this.f15327b;
                if (d2Var2.K0 != 1) {
                    d2Var2.f15206h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                d2 d2Var3 = this.f15327b;
                if (d2Var3.K0 != 2) {
                    d2Var3.f15222v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                d2.V(this.f15327b);
                return;
            case 5:
                d2 d2Var4 = this.f15327b;
                d2Var4.s0(2147483646, 0, true);
                ni0 ni0Var = d2Var4.O0;
                if (ni0Var != null) {
                    ni0Var.h(false);
                    d2Var4.O0 = null;
                    return;
                }
                return;
            default:
                d2 d2Var5 = this.f15327b;
                d2Var5.s0(0, 0, false);
                ni0 ni0Var2 = d2Var5.O0;
                if (ni0Var2 != null) {
                    ni0Var2.h(true);
                    d2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
