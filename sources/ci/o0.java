package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f5102a;
    public final u0 f5103b;

    public o0(u0 u0Var, int i10) {
        this.f5102a = i10;
        this.f5103b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f5102a) {
            case 0:
                this.f5103b.b();
                return;
            case 1:
                u0 u0Var = this.f5103b;
                u0Var.e = false;
                r0 r0Var = u0Var.f5592s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f5592s = null;
                }
                t0 t0Var = u0Var.f5590n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f5588c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f5103b;
                if (u0Var2.f5588c && u0Var2.f5591r != null) {
                    u0Var2.f5590n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f5588c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
