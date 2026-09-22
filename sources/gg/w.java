package gg;

import org.telegram.ui.o10;
import org.telegram.ui.wv;
public final class w implements Runnable {
    public final int f9963a;
    public final i0 f9964b;

    public w(i0 i0Var, int i10) {
        this.f9963a = i10;
        this.f9964b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f9963a) {
            case 0:
                i0 i0Var = this.f9964b;
                o10 o10Var = i0Var.A0;
                if (o10Var != null) {
                    ((wv) o10Var).i(false, null, i0Var.f9789y0, i0Var.f9790z0);
                    return;
                }
                return;
            default:
                i0 i0Var2 = this.f9964b;
                i0Var2.getClass();
                i0Var2.f9760c = f0.All;
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
