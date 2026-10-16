package hg;

import org.telegram.ui.aw;
import org.telegram.ui.s10;
public final class v implements Runnable {
    public final int f10771a;
    public final h0 f10772b;

    public v(h0 h0Var, int i10) {
        this.f10771a = i10;
        this.f10772b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f10771a) {
            case 0:
                h0 h0Var = this.f10772b;
                s10 s10Var = h0Var.A0;
                if (s10Var != null) {
                    ((aw) s10Var).i(false, null, h0Var.f10599y0, h0Var.f10600z0);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f10772b;
                h0Var2.getClass();
                h0Var2.f10570c = e0.All;
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
