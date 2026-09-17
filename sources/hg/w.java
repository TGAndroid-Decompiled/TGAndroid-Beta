package hg;

import org.telegram.ui.o10;
import org.telegram.ui.xv;
public final class w implements Runnable {
    public final int f11319a;
    public final i0 f11320b;

    public w(i0 i0Var, int i10) {
        this.f11319a = i10;
        this.f11320b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f11319a) {
            case 0:
                i0 i0Var = this.f11320b;
                o10 o10Var = i0Var.A0;
                if (o10Var != null) {
                    ((xv) o10Var).i(false, null, i0Var.f11128y0, i0Var.f11129z0);
                    return;
                }
                return;
            default:
                i0 i0Var2 = this.f11320b;
                i0Var2.getClass();
                i0Var2.f11098c = f0.All;
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
