package of;

import org.telegram.ui.jv;
import org.telegram.ui.w00;
public final class t implements Runnable {
    public final int f19502a;
    public final f0 f19503b;

    public t(f0 f0Var, int i9) {
        this.f19502a = i9;
        this.f19503b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f19502a) {
            case 0:
                f0 f0Var = this.f19503b;
                w00 w00Var = f0Var.f19314w0;
                if (w00Var != null) {
                    ((jv) w00Var).i(false, null, f0Var.f19311u0, f0Var.f19312v0);
                    return;
                }
                return;
            default:
                f0 f0Var2 = this.f19503b;
                f0Var2.getClass();
                f0Var2.f19288c = c0.All;
                f0Var2.E.clear();
                int i9 = f0Var2.B0;
                if (i9 >= 0 && i9 < f0Var2.h()) {
                    f0Var2.m(f0Var2.B0);
                }
                f0Var2.Q();
                return;
        }
    }
}
