package gg;

import org.telegram.ui.p10;
import org.telegram.ui.xv;
public final class v implements Runnable {
    public final int f10834a;
    public final h0 f10835b;

    public v(h0 h0Var, int i10) {
        this.f10834a = i10;
        this.f10835b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f10834a) {
            case 0:
                h0 h0Var = this.f10835b;
                p10 p10Var = h0Var.A0;
                if (p10Var != null) {
                    ((xv) p10Var).i(false, null, h0Var.f10645y0, h0Var.f10646z0);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f10835b;
                h0Var2.getClass();
                h0Var2.f10615c = e0.All;
                h0Var2.I.clear();
                int i10 = h0Var2.F0;
                if (i10 >= 0 && i10 < h0Var2.h()) {
                    h0Var2.m(h0Var2.F0);
                }
                h0Var2.Q();
                return;
        }
    }
}
