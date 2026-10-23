package hg;

import org.telegram.ui.jv;
import org.telegram.ui.y00;
public final class v implements Runnable {
    public final int f12105a;
    public final h0 f12106b;

    public v(h0 h0Var, int i10) {
        this.f12105a = i10;
        this.f12106b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f12105a) {
            case 0:
                h0 h0Var = this.f12106b;
                y00 y00Var = h0Var.A0;
                if (y00Var != null) {
                    ((jv) y00Var).i(false, null, h0Var.f11930y0, h0Var.f11931z0);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f12106b;
                h0Var2.getClass();
                h0Var2.f11901c = e0.All;
                h0Var2.I.clear();
                int i10 = h0Var2.F0;
                if (i10 >= 0 && i10 < h0Var2.h()) {
                    h0Var2.m(h0Var2.F0);
                }
                h0Var2.P();
                return;
        }
    }
}
