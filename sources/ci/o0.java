package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f5639a;
    public final u0 f5640b;

    public o0(u0 u0Var, int i10) {
        this.f5639a = i10;
        this.f5640b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f5639a) {
            case 0:
                this.f5640b.b();
                return;
            case 1:
                u0 u0Var = this.f5640b;
                u0Var.f6046e = false;
                r0 r0Var = u0Var.f6050s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f6050s = null;
                }
                t0 t0Var = u0Var.f6048n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f6045c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f5640b;
                if (u0Var2.f6045c && u0Var2.f6049r != null) {
                    u0Var2.f6048n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f6045c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
