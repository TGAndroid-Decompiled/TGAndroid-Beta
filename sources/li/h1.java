package li;

import org.telegram.ui.ni0;
public final class h1 implements Runnable {
    public final int f17274a;
    public final b2 f17275b;

    public h1(b2 b2Var, int i10) {
        this.f17274a = i10;
        this.f17275b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f17274a) {
            case 0:
                this.f17275b.C0();
                return;
            case 1:
                b2 b2Var = this.f17275b;
                if (b2Var.K0 != 0) {
                    b2Var.f17120a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                b2 b2Var2 = this.f17275b;
                if (b2Var2.K0 != 1) {
                    b2Var2.f17130h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                b2 b2Var3 = this.f17275b;
                if (b2Var3.K0 != 2) {
                    b2Var3.f17146v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                b2.W(this.f17275b);
                return;
            case 5:
                b2 b2Var4 = this.f17275b;
                b2Var4.t0(2147483646, 0, true);
                ni0 ni0Var = b2Var4.O0;
                if (ni0Var != null) {
                    ni0Var.g(false);
                    b2Var4.O0 = null;
                    return;
                }
                return;
            default:
                b2 b2Var5 = this.f17275b;
                b2Var5.t0(0, 0, false);
                ni0 ni0Var2 = b2Var5.O0;
                if (ni0Var2 != null) {
                    ni0Var2.g(true);
                    b2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
