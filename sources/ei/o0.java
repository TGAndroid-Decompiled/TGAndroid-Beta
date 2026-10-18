package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f9538a;
    public final u0 f9539b;

    public o0(u0 u0Var, int i10) {
        this.f9538a = i10;
        this.f9539b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f9538a) {
            case 0:
                this.f9539b.b();
                return;
            case 1:
                u0 u0Var = this.f9539b;
                u0Var.e = false;
                r0 r0Var = u0Var.f9881s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f9881s = null;
                }
                t0 t0Var = u0Var.f9879n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f9877c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f9539b;
                if (u0Var2.f9877c && u0Var2.f9880r != null) {
                    u0Var2.f9879n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f9877c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
