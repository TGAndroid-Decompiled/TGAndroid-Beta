package ig;

import org.telegram.ui.iv;
import org.telegram.ui.x00;
public final class v implements Runnable {
    public final int f14271a;
    public final i0 f14272b;

    public v(i0 i0Var, int i10) {
        this.f14271a = i10;
        this.f14272b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f14271a) {
            case 0:
                i0 i0Var = this.f14272b;
                x00 x00Var = i0Var.A0;
                if (x00Var != null) {
                    ((iv) x00Var).j(false, null, i0Var.f14103y0, i0Var.f14104z0);
                    return;
                }
                return;
            default:
                i0 i0Var2 = this.f14272b;
                i0Var2.getClass();
                i0Var2.f14074c = f0.All;
                i0Var2.I.clear();
                int i10 = i0Var2.F0;
                if (i10 >= 0 && i10 < i0Var2.h()) {
                    i0Var2.m(i0Var2.F0);
                }
                i0Var2.P();
                return;
        }
    }
}
