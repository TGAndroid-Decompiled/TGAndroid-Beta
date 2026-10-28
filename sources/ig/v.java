package ig;

import org.telegram.ui.kv;
import org.telegram.ui.z00;
public final class v implements Runnable {
    public final int f14270a;
    public final i0 f14271b;

    public v(i0 i0Var, int i10) {
        this.f14270a = i10;
        this.f14271b = i0Var;
    }

    @Override
    public final void run() {
        switch (this.f14270a) {
            case 0:
                i0 i0Var = this.f14271b;
                z00 z00Var = i0Var.A0;
                if (z00Var != null) {
                    ((kv) z00Var).j(false, null, i0Var.f14102y0, i0Var.f14103z0);
                    return;
                }
                return;
            default:
                i0 i0Var2 = this.f14271b;
                i0Var2.getClass();
                i0Var2.f14073c = f0.All;
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
