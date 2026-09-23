package gg;

import org.telegram.ui.l10;
import org.telegram.ui.tv;
public final class w implements Runnable {
    public final int f9949a;
    public final i0 f9950b;

    public w(i0 i0Var, int i10) {
        this.f9949a = i10;
        this.f9950b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f9949a) {
            case 0:
                i0 i0Var = this.f9950b;
                l10 l10Var = i0Var.A0;
                if (l10Var != null) {
                    ((tv) l10Var).i(false, null, i0Var.f9775y0, i0Var.f9776z0);
                    return;
                }
                return;
            default:
                i0 i0Var2 = this.f9950b;
                i0Var2.getClass();
                i0Var2.f9746c = f0.All;
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
