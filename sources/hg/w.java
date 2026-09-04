package hg;

import org.telegram.ui.o10;
import org.telegram.ui.xv;
public final class w implements Runnable {
    public final int f11293a;
    public final i0 f11294b;

    public w(i0 i0Var, int i10) {
        this.f11293a = i10;
        this.f11294b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f11293a) {
            case 0:
                i0 i0Var = this.f11294b;
                o10 o10Var = i0Var.A0;
                if (o10Var != null) {
                    ((xv) o10Var).i(false, null, i0Var.f11102y0, i0Var.f11103z0);
                    return;
                }
                return;
            default:
                i0 i0Var2 = this.f11294b;
                i0Var2.getClass();
                i0Var2.f11072c = f0.All;
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
