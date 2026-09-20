package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class o0 implements Runnable {
    public final int f5108a;
    public final u0 f5109b;

    public o0(u0 u0Var, int i10) {
        this.f5108a = i10;
        this.f5109b = u0Var;
    }

    @Override
    public final void run() {
        switch (this.f5108a) {
            case 0:
                this.f5109b.b();
                return;
            case 1:
                u0 u0Var = this.f5109b;
                u0Var.e = false;
                r0 r0Var = u0Var.f5598s;
                if (r0Var != null) {
                    r0Var.a(true);
                    u0Var.f5598s = null;
                }
                t0 t0Var = u0Var.f5596n;
                if (t0Var != null) {
                    t0Var.a();
                }
                u0Var.f5594c = false;
                u0Var.d();
                return;
            default:
                u0 u0Var2 = this.f5109b;
                if (u0Var2.f5594c && u0Var2.f5597r != null) {
                    u0Var2.f5596n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    u0Var2.f5594c = false;
                    u0Var2.d();
                    return;
                }
                return;
        }
    }
}
