package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f7709a;
    public final u0 f7710b;

    public o0(u0 u0Var, int i10) {
        this.f7709a = i10;
        this.f7710b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f7709a) {
            case 0:
                this.f7710b.b();
                return;
            case 1:
                u0 u0Var = this.f7710b;
                u0Var.f8215e = false;
                r0 r0Var = u0Var.f8219s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f8219s = null;
                }
                t0 t0Var = u0Var.f8217n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f8214c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f7710b;
                if (u0Var2.f8214c && u0Var2.f8218r != null) {
                    u0Var2.f8217n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f8214c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
