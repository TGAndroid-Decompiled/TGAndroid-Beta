package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f7737a;
    public final u0 f7738b;

    public o0(u0 u0Var, int i10) {
        this.f7737a = i10;
        this.f7738b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f7737a) {
            case 0:
                this.f7738b.b();
                return;
            case 1:
                u0 u0Var = this.f7738b;
                u0Var.f8243e = false;
                r0 r0Var = u0Var.f8247s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f8247s = null;
                }
                t0 t0Var = u0Var.f8245n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f8242c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f7738b;
                if (u0Var2.f8242c && u0Var2.f8246r != null) {
                    u0Var2.f8245n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f8242c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
