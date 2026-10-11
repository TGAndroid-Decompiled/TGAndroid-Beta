package gg;

import org.telegram.ui.m10;
import org.telegram.ui.uv;
public final class v implements Runnable {
    public final int f10835a;
    public final h0 f10836b;

    public v(h0 h0Var, int i10) {
        this.f10835a = i10;
        this.f10836b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f10835a) {
            case 0:
                h0 h0Var = this.f10836b;
                m10 m10Var = h0Var.A0;
                if (m10Var != null) {
                    ((uv) m10Var).i(false, null, h0Var.f10646y0, h0Var.f10647z0);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f10836b;
                h0Var2.getClass();
                h0Var2.f10616c = e0.All;
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
