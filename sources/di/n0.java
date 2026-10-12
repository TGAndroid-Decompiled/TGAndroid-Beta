package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n0 implements Runnable {
    public final int f7440a;
    public final t0 f7441b;

    public n0(t0 t0Var, int i10) {
        this.f7440a = i10;
        this.f7441b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f7440a) {
            case 0:
                this.f7441b.b();
                return;
            case 1:
                t0 t0Var = this.f7441b;
                t0Var.e = false;
                q0 q0Var = t0Var.f7818s;
                if (q0Var != null) {
                    q0Var.a(true);
                    t0Var.f7818s = null;
                }
                s0 s0Var = t0Var.f7816n;
                if (s0Var != null) {
                    s0Var.a();
                }
                t0Var.f7814c = false;
                t0Var.d();
                return;
            default:
                t0 t0Var2 = this.f7441b;
                if (t0Var2.f7814c && t0Var2.f7817r != null) {
                    t0Var2.f7816n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    t0Var2.f7814c = false;
                    t0Var2.d();
                    return;
                }
                return;
        }
    }
}
