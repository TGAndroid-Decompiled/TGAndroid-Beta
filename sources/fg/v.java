package fg;

import org.telegram.ui.q10;
import org.telegram.ui.yv;
public final class v implements Runnable {
    public final int f8233a;
    public final h0 f8234b;

    public v(h0 h0Var, int i10) {
        this.f8233a = i10;
        this.f8234b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f8233a) {
            case 0:
                h0 h0Var = this.f8234b;
                q10 q10Var = h0Var.A0;
                if (q10Var != null) {
                    ((yv) q10Var).i(false, null, h0Var.f8059y0, h0Var.f8060z0);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f8234b;
                h0Var2.getClass();
                h0Var2.f8030c = e0.All;
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
