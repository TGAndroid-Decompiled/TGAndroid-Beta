package li;

import org.telegram.ui.bg0;
public final class h1 implements Runnable {
    public final int f18617a;
    public final b2 f18618b;

    public h1(b2 b2Var, int i7) {
        this.f18617a = i7;
        this.f18618b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f18617a) {
            case 0:
                this.f18618b.G0();
                return;
            case 1:
                b2 b2Var = this.f18618b;
                if (b2Var.K0 != 0) {
                    b2Var.f18439a0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                b2 b2Var2 = this.f18618b;
                if (b2Var2.K0 != 1) {
                    b2Var2.f18450h0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                b2 b2Var3 = this.f18618b;
                if (b2Var3.K0 != 2) {
                    b2Var3.f18466v0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                b2.a0(this.f18618b);
                return;
            case 5:
                b2 b2Var4 = this.f18618b;
                b2Var4.x0(2147483646, 0, true);
                bg0 bg0Var = b2Var4.O0;
                if (bg0Var != null) {
                    bg0Var.g(false);
                    b2Var4.O0 = null;
                    return;
                }
                return;
            default:
                b2 b2Var5 = this.f18618b;
                b2Var5.x0(0, 0, false);
                bg0 bg0Var2 = b2Var5.O0;
                if (bg0Var2 != null) {
                    bg0Var2.g(true);
                    b2Var5.O0 = null;
                    return;
                }
                return;
        }
    }
}
