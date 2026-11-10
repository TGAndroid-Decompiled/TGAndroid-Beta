package li;

import org.telegram.ui.eg0;
public final class h1 implements Runnable {
    public final int f18623a;
    public final b2 f18624b;

    public h1(b2 b2Var, int i7) {
        this.f18623a = i7;
        this.f18624b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f18623a) {
            case 0:
                this.f18624b.G0();
                return;
            case 1:
                b2 b2Var = this.f18624b;
                if (b2Var.K0 != 0) {
                    b2Var.f18445a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                b2 b2Var2 = this.f18624b;
                if (b2Var2.K0 != 1) {
                    b2Var2.f18456h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                b2 b2Var3 = this.f18624b;
                if (b2Var3.K0 != 2) {
                    b2Var3.f18472v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                b2.a0(this.f18624b);
                return;
            case 5:
                b2 b2Var4 = this.f18624b;
                b2Var4.x0(2147483646, 0, true);
                eg0 eg0Var = b2Var4.O0;
                if (eg0Var != null) {
                    eg0Var.g(false);
                    b2Var4.O0 = null;
                    return;
                }
                return;
            default:
                b2 b2Var5 = this.f18624b;
                b2Var5.x0(0, 0, false);
                eg0 eg0Var2 = b2Var5.O0;
                if (eg0Var2 != null) {
                    eg0Var2.g(true);
                    b2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
