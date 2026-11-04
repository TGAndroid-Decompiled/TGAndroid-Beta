package mi;

import org.telegram.ui.vf0;
public final class i1 implements Runnable {
    public final int f19682a;
    public final c2 f19683b;

    public i1(c2 c2Var, int i3) {
        this.f19682a = i3;
        this.f19683b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f19682a) {
            case 0:
                this.f19683b.G0();
                return;
            case 1:
                c2 c2Var = this.f19683b;
                if (c2Var.L0 != 0) {
                    c2Var.f19510b0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                c2 c2Var2 = this.f19683b;
                if (c2Var2.L0 != 1) {
                    c2Var2.f19520i0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                c2 c2Var3 = this.f19683b;
                if (c2Var3.L0 != 2) {
                    c2Var3.f19537w0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                c2.a0(this.f19683b);
                return;
            case 5:
                c2 c2Var4 = this.f19683b;
                c2Var4.x0(2147483646, 0, true);
                vf0 vf0Var = c2Var4.P0;
                if (vf0Var != null) {
                    vf0Var.g(false);
                    c2Var4.P0 = null;
                    return;
                }
                return;
            default:
                c2 c2Var5 = this.f19683b;
                c2Var5.x0(0, 0, false);
                vf0 vf0Var2 = c2Var5.P0;
                if (vf0Var2 != null) {
                    vf0Var2.g(true);
                    c2Var5.P0 = null;
                    return;
                }
                return;
        }
    }
}
