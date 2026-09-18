package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f5107a;
    public final u0 f5108b;

    public o0(u0 u0Var, int i10) {
        this.f5107a = i10;
        this.f5108b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f5107a) {
            case 0:
                this.f5108b.b();
                return;
            case 1:
                u0 u0Var = this.f5108b;
                u0Var.e = false;
                r0 r0Var = u0Var.f5597s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f5597s = null;
                }
                t0 t0Var = u0Var.f5595n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f5593c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f5108b;
                if (u0Var2.f5593c && u0Var2.f5596r != null) {
                    u0Var2.f5595n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f5593c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
