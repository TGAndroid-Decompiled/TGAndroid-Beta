package gg;

import org.telegram.ui.q10;
import org.telegram.ui.yv;
public final class w implements Runnable {
    public final int f9967a;
    public final i0 f9968b;

    public w(i0 i0Var, int i10) {
        this.f9967a = i10;
        this.f9968b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f9967a) {
            case 0:
                i0 i0Var = this.f9968b;
                q10 q10Var = i0Var.A0;
                if (q10Var != null) {
                    ((yv) q10Var).i(false, null, i0Var.f9793y0, i0Var.f9794z0);
                    return;
                }
                return;
            default:
                i0 i0Var2 = this.f9968b;
                i0Var2.getClass();
                i0Var2.f9764c = f0.All;
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
