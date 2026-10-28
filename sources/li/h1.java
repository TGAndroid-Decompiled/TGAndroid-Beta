package li;

import org.telegram.ui.pi0;
public final class h1 implements Runnable {
    public final int f17273a;
    public final b2 f17274b;

    public h1(b2 b2Var, int i10) {
        this.f17273a = i10;
        this.f17274b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17273a) {
            case 0:
                this.f17274b.C0();
                return;
            case 1:
                b2 b2Var = this.f17274b;
                if (b2Var.K0 != 0) {
                    b2Var.f17119a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                b2 b2Var2 = this.f17274b;
                if (b2Var2.K0 != 1) {
                    b2Var2.f17129h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                b2 b2Var3 = this.f17274b;
                if (b2Var3.K0 != 2) {
                    b2Var3.f17145v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                b2.W(this.f17274b);
                return;
            case 5:
                b2 b2Var4 = this.f17274b;
                b2Var4.t0(2147483646, 0, true);
                pi0 pi0Var = b2Var4.O0;
                if (pi0Var != null) {
                    pi0Var.g(false);
                    b2Var4.O0 = null;
                    return;
                }
                return;
            default:
                b2 b2Var5 = this.f17274b;
                b2Var5.t0(0, 0, false);
                pi0 pi0Var2 = b2Var5.O0;
                if (pi0Var2 != null) {
                    pi0Var2.g(true);
                    b2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
