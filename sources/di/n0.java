package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n0 implements Runnable {
    public final int f7443a;
    public final t0 f7444b;

    public n0(t0 t0Var, int i10) {
        this.f7443a = i10;
        this.f7444b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f7443a) {
            case 0:
                this.f7444b.b();
                return;
            case 1:
                t0 t0Var = this.f7444b;
                t0Var.e = false;
                q0 q0Var = t0Var.f7821s;
                if (q0Var != null) {
                    q0Var.a(true);
                    t0Var.f7821s = null;
                }
                s0 s0Var = t0Var.f7819n;
                if (s0Var != null) {
                    s0Var.a();
                }
                t0Var.f7817c = false;
                t0Var.d();
                return;
            default:
                t0 t0Var2 = this.f7444b;
                if (t0Var2.f7817c && t0Var2.f7820r != null) {
                    t0Var2.f7819n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    t0Var2.f7817c = false;
                    t0Var2.d();
                    return;
                }
                return;
        }
    }
}
