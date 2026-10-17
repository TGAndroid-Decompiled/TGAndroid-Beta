package hg;

import org.telegram.ui.iv;
import org.telegram.ui.x00;
public final class v implements Runnable {
    public final int f12076a;
    public final h0 f12077b;

    public v(h0 h0Var, int i10) {
        this.f12076a = i10;
        this.f12077b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f12076a) {
            case 0:
                h0 h0Var = this.f12077b;
                x00 x00Var = h0Var.A0;
                if (x00Var != null) {
                    ((iv) x00Var).i(false, null, h0Var.f11904y0, h0Var.f11905z0);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f12077b;
                h0Var2.getClass();
                h0Var2.f11875c = e0.All;
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
