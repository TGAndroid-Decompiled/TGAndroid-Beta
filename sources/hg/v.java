package hg;

import org.telegram.ui.aw;
import org.telegram.ui.t10;
public final class v implements Runnable {
    public final int f10767a;
    public final h0 f10768b;

    public v(h0 h0Var, int i10) {
        this.f10767a = i10;
        this.f10768b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f10767a) {
            case 0:
                h0 h0Var = this.f10768b;
                t10 t10Var = h0Var.A0;
                if (t10Var != null) {
                    ((aw) t10Var).i(false, null, h0Var.f10595y0, h0Var.f10596z0);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f10768b;
                h0Var2.getClass();
                h0Var2.f10566c = e0.All;
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
