package nh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f18207a;
    public final u0 f18208b;

    public o0(u0 u0Var, int i10) {
        this.f18207a = i10;
        this.f18208b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f18207a) {
            case 0:
                this.f18208b.b();
                return;
            case 1:
                u0 u0Var = this.f18208b;
                u0Var.f18705e = false;
                r0 r0Var = u0Var.f18709s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f18709s = null;
                }
                t0 t0Var = u0Var.f18707n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f18704c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f18208b;
                if (u0Var2.f18704c && u0Var2.f18708r != null) {
                    u0Var2.f18707n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f18704c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
