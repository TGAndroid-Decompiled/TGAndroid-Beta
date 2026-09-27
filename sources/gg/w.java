package gg;

import org.telegram.ui.n10;
import org.telegram.ui.wv;
public final class w implements Runnable {
    public final int f9954a;
    public final i0 f9955b;

    public w(i0 i0Var, int i10) {
        this.f9954a = i10;
        this.f9955b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f9954a) {
            case 0:
                i0 i0Var = this.f9955b;
                n10 n10Var = i0Var.A0;
                if (n10Var != null) {
                    ((wv) n10Var).k(false, null, i0Var.f9780y0, i0Var.f9781z0);
                    return;
                }
                return;
            default:
                i0 i0Var2 = this.f9955b;
                i0Var2.getClass();
                i0Var2.f9751c = f0.All;
                i0Var2.I.clear();
                int i10 = i0Var2.F0;
                if (i10 >= 0 && i10 < i0Var2.h()) {
                    i0Var2.m(i0Var2.F0);
                }
                i0Var2.Q();
                return;
        }
    }
}
