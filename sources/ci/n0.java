package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n0 implements Runnable {
    public final int f5619a;
    public final t0 f5620b;

    public n0(t0 t0Var, int i10) {
        this.f5619a = i10;
        this.f5620b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f5619a) {
            case 0:
                this.f5620b.b();
                return;
            case 1:
                t0 t0Var = this.f5620b;
                t0Var.f5980e = false;
                q0 q0Var = t0Var.f5984s;
                if (q0Var != null) {
                    q0Var.a(true);
                    t0Var.f5984s = null;
                }
                s0 s0Var = t0Var.f5982n;
                if (s0Var != null) {
                    s0Var.a();
                }
                t0Var.f5979c = false;
                t0Var.d();
                return;
            default:
                t0 t0Var2 = this.f5620b;
                if (t0Var2.f5979c && t0Var2.f5983r != null) {
                    t0Var2.f5982n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    t0Var2.f5979c = false;
                    t0Var2.d();
                    return;
                }
                return;
        }
    }
}
