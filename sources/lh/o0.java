package lh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class o0 implements Runnable {

    public final int f16463a;

    public final u0 f16464b;

    public o0(u0 u0Var, int i10) {
        this.f16463a = i10;
        this.f16464b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f16463a) {
            case 0:
                this.f16464b.b();
                break;
            case 1:
                u0 u0Var = this.f16464b;
                u0Var.f16889e = false;
                r0 r0Var = u0Var.f16893s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f16893s = null;
                }
                t0 t0Var = u0Var.f16891n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f16888c = false;
                u0Var.d();
                break;
            default:
                u0 u0Var2 = this.f16464b;
                if (u0Var2.f16888c && u0Var2.f16892r != null) {
                    u0Var2.f16891n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f16888c = false;
                    u0Var2.d();
                    break;
                }
                break;
        }
    }
}
