package bi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class s0 implements Runnable {
    public final int f3637a;
    public final y0 f3638b;

    public s0(y0 y0Var, int i10) {
        this.f3637a = i10;
        this.f3638b = y0Var;
    }

    @Override
    public final void run() {
        switch (this.f3637a) {
            case 0:
                this.f3638b.b();
                return;
            case 1:
                y0 y0Var = this.f3638b;
                y0Var.e = false;
                v0 v0Var = y0Var.f3959s;
                if (v0Var != null) {
                    v0Var.a(true);
                    y0Var.f3959s = null;
                }
                x0 x0Var = y0Var.f3957n;
                if (x0Var != null) {
                    x0Var.a();
                }
                y0Var.f3955c = false;
                y0Var.d();
                return;
            default:
                y0 y0Var2 = this.f3638b;
                if (y0Var2.f3955c && y0Var2.f3958r != null) {
                    y0Var2.f3957n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    y0Var2.f3955c = false;
                    y0Var2.d();
                    return;
                }
                return;
        }
    }
}
