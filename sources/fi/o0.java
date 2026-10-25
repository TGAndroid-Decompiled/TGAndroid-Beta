package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f11330a;
    public final u0 f11331b;

    public o0(u0 u0Var, int i10) {
        this.f11330a = i10;
        this.f11331b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f11330a) {
            case 0:
                this.f11331b.b();
                return;
            case 1:
                u0 u0Var = this.f11331b;
                u0Var.e = false;
                r0 r0Var = u0Var.f11739s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f11739s = null;
                }
                t0 t0Var = u0Var.f11737n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f11735c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f11331b;
                if (u0Var2.f11735c && u0Var2.f11738r != null) {
                    u0Var2.f11737n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f11735c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
