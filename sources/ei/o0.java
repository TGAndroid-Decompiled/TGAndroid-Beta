package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f9539a;
    public final u0 f9540b;

    public o0(u0 u0Var, int i10) {
        this.f9539a = i10;
        this.f9540b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f9539a) {
            case 0:
                this.f9540b.b();
                return;
            case 1:
                u0 u0Var = this.f9540b;
                u0Var.e = false;
                r0 r0Var = u0Var.f9882s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f9882s = null;
                }
                t0 t0Var = u0Var.f9880n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f9878c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f9540b;
                if (u0Var2.f9878c && u0Var2.f9881r != null) {
                    u0Var2.f9880n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f9878c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
