package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n0 implements Runnable {
    public final int f5618a;
    public final t0 f5619b;

    public n0(t0 t0Var, int i10) {
        this.f5618a = i10;
        this.f5619b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f5618a) {
            case 0:
                this.f5619b.b();
                return;
            case 1:
                t0 t0Var = this.f5619b;
                t0Var.f5979e = false;
                q0 q0Var = t0Var.f5983s;
                if (q0Var != null) {
                    q0Var.a(true);
                    t0Var.f5983s = null;
                }
                s0 s0Var = t0Var.f5981n;
                if (s0Var != null) {
                    s0Var.a();
                }
                t0Var.f5978c = false;
                t0Var.d();
                return;
            default:
                t0 t0Var2 = this.f5619b;
                if (t0Var2.f5978c && t0Var2.f5982r != null) {
                    t0Var2.f5981n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    t0Var2.f5978c = false;
                    t0Var2.d();
                    return;
                }
                return;
        }
    }
}
