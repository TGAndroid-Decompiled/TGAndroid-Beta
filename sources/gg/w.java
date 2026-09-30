package gg;

import org.telegram.ui.k10;
import org.telegram.ui.sv;
public final class w implements Runnable {
    public final int f9962a;
    public final i0 f9963b;

    public w(i0 i0Var, int i10) {
        this.f9962a = i10;
        this.f9963b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f9962a) {
            case 0:
                i0 i0Var = this.f9963b;
                k10 k10Var = i0Var.A0;
                if (k10Var != null) {
                    ((sv) k10Var).i(false, null, i0Var.f9786y0, i0Var.f9787z0);
                    return;
                }
                return;
            default:
                i0 i0Var2 = this.f9963b;
                i0Var2.getClass();
                i0Var2.f9757c = f0.All;
                i0Var2.I.clear();
                int i10 = i0Var2.F0;
                if (i10 >= 0 && i10 < i0Var2.h()) {
                    i0Var2.m(i0Var2.F0);
                }
                i0Var2.Q();
                return;
        }
    }
}
