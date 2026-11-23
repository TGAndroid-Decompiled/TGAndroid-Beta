package oi;

import org.telegram.ui.eg0;
public final class f1 implements Runnable {
    public final int f22082a;
    public final a2 f22083b;

    public f1(a2 a2Var, int i7) {
        this.f22082a = i7;
        this.f22083b = a2Var;
    }

    @Override
    public final void run() {
        switch (this.f22082a) {
            case 0:
                this.f22083b.G0();
                return;
            case 1:
                a2 a2Var = this.f22083b;
                if (a2Var.L0 != 0) {
                    a2Var.f21928b0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                a2 a2Var2 = this.f22083b;
                if (a2Var2.L0 != 1) {
                    a2Var2.f21938i0.setVisibility(8);
                    return;
                }
                return;
            case 3:
                a2 a2Var3 = this.f22083b;
                if (a2Var3.L0 != 2) {
                    a2Var3.f21955w0.setVisibility(8);
                    return;
                }
                return;
            case 4:
                a2.a0(this.f22083b);
                return;
            case 5:
                a2 a2Var4 = this.f22083b;
                a2Var4.x0(2147483646, 0, true);
                eg0 eg0Var = a2Var4.P0;
                if (eg0Var != null) {
                    eg0Var.h(false);
                    a2Var4.P0 = null;
                    return;
                }
                return;
            default:
                a2 a2Var5 = this.f22083b;
                a2Var5.x0(0, 0, false);
                eg0 eg0Var2 = a2Var5.P0;
                if (eg0Var2 != null) {
                    eg0Var2.h(true);
                    a2Var5.P0 = null;
                    return;
                }
                return;
        }
    }
}
