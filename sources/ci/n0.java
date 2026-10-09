package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n0 implements Runnable {
    public final int f5620a;
    public final t0 f5621b;

    public n0(t0 t0Var, int i10) {
        this.f5620a = i10;
        this.f5621b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f5620a) {
            case 0:
                this.f5621b.b();
                return;
            case 1:
                t0 t0Var = this.f5621b;
                t0Var.f5981e = false;
                q0 q0Var = t0Var.f5985s;
                if (q0Var != null) {
                    q0Var.a(true);
                    t0Var.f5985s = null;
                }
                s0 s0Var = t0Var.f5983n;
                if (s0Var != null) {
                    s0Var.a();
                }
                t0Var.f5980c = false;
                t0Var.d();
                return;
            default:
                t0 t0Var2 = this.f5621b;
                if (t0Var2.f5980c && t0Var2.f5984r != null) {
                    t0Var2.f5983n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    t0Var2.f5980c = false;
                    t0Var2.d();
                    return;
                }
                return;
        }
    }
}
