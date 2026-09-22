package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f5104a;
    public final u0 f5105b;

    public o0(u0 u0Var, int i10) {
        this.f5104a = i10;
        this.f5105b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f5104a) {
            case 0:
                this.f5105b.b();
                return;
            case 1:
                u0 u0Var = this.f5105b;
                u0Var.e = false;
                r0 r0Var = u0Var.f5594s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f5594s = null;
                }
                t0 t0Var = u0Var.f5592n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f5590c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f5105b;
                if (u0Var2.f5590c && u0Var2.f5593r != null) {
                    u0Var2.f5592n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f5590c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
