package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f5234a;
    public final u0 f5235b;

    public o0(u0 u0Var, int i10) {
        this.f5234a = i10;
        this.f5235b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f5234a) {
            case 0:
                this.f5235b.b();
                return;
            case 1:
                u0 u0Var = this.f5235b;
                u0Var.e = false;
                r0 r0Var = u0Var.f5603s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f5603s = null;
                }
                t0 t0Var = u0Var.f5601n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f5599c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f5235b;
                if (u0Var2.f5599c && u0Var2.f5602r != null) {
                    u0Var2.f5601n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f5599c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
