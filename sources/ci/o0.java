package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f5638a;
    public final u0 f5639b;

    public o0(u0 u0Var, int i10) {
        this.f5638a = i10;
        this.f5639b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f5638a) {
            case 0:
                this.f5639b.b();
                return;
            case 1:
                u0 u0Var = this.f5639b;
                u0Var.f6045e = false;
                r0 r0Var = u0Var.f6049s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f6049s = null;
                }
                t0 t0Var = u0Var.f6047n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f6044c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f5639b;
                if (u0Var2.f6044c && u0Var2.f6048r != null) {
                    u0Var2.f6047n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f6044c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
