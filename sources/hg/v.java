package hg;

import org.telegram.ui.jv;
import org.telegram.ui.x00;
public final class v implements Runnable {
    public final int f12078a;
    public final h0 f12079b;

    public v(h0 h0Var, int i10) {
        this.f12078a = i10;
        this.f12079b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f12078a) {
            case 0:
                h0 h0Var = this.f12079b;
                x00 x00Var = h0Var.A0;
                if (x00Var != null) {
                    ((jv) x00Var).i(false, null, h0Var.f11906y0, h0Var.f11907z0);
                    return;
                }
                return;
            default:
                h0 h0Var2 = this.f12079b;
                h0Var2.getClass();
                h0Var2.f11877c = e0.All;
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
