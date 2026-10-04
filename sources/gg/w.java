package gg;

import org.telegram.ui.o10;
import org.telegram.ui.xv;
public final class w implements Runnable {
    public final int f10834a;
    public final i0 f10835b;

    public w(i0 i0Var, int i10) {
        this.f10834a = i10;
        this.f10835b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f10834a) {
            case 0:
                i0 i0Var = this.f10835b;
                o10 o10Var = i0Var.A0;
                if (o10Var != null) {
                    ((xv) o10Var).j(false, null, i0Var.f10641y0, i0Var.f10642z0);
                    return;
                }
                return;
            default:
                i0 i0Var2 = this.f10835b;
                i0Var2.getClass();
                i0Var2.f10611c = f0.All;
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
