package gg;

import org.telegram.ui.n10;
import org.telegram.ui.vv;
public final class v implements Runnable {
    public final int f10836a;
    public final h0 f10837b;

    public v(h0 h0Var, int i10) {
        this.f10836a = i10;
        this.f10837b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f10836a) {
            case 0:
                h0 h0Var = this.f10837b;
                n10 n10Var = h0Var.A0;
                if (n10Var != null) {
                    ((vv) n10Var).i(false, null, h0Var.f10647y0, h0Var.f10648z0);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f10837b;
                h0Var2.getClass();
                h0Var2.f10617c = e0.All;
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
