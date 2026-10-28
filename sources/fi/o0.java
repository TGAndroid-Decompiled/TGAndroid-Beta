package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f11329a;
    public final u0 f11330b;

    public o0(u0 u0Var, int i10) {
        this.f11329a = i10;
        this.f11330b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f11329a) {
            case 0:
                this.f11330b.b();
                return;
            case 1:
                u0 u0Var = this.f11330b;
                u0Var.e = false;
                r0 r0Var = u0Var.f11738s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f11738s = null;
                }
                t0 t0Var = u0Var.f11736n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f11734c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f11330b;
                if (u0Var2.f11734c && u0Var2.f11737r != null) {
                    u0Var2.f11736n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f11734c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
