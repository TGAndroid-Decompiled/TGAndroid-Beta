package hg;

import org.telegram.ui.hv;
import org.telegram.ui.v00;
public final class v implements Runnable {
    public final int f12075a;
    public final h0 f12076b;

    public v(h0 h0Var, int i10) {
        this.f12075a = i10;
        this.f12076b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f12075a) {
            case 0:
                h0 h0Var = this.f12076b;
                v00 v00Var = h0Var.A0;
                if (v00Var != null) {
                    ((hv) v00Var).i(false, null, h0Var.f11903y0, h0Var.f11904z0);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f12076b;
                h0Var2.getClass();
                h0Var2.f11874c = e0.All;
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
