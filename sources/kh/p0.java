package kh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class p0 implements Runnable {
    public final int f15814a;
    public final v0 f15815b;

    public p0(v0 v0Var, int i9) {
        this.f15814a = i9;
        this.f15815b = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f15814a) {
            case 0:
                this.f15815b.b();
                return;
            case 1:
                v0 v0Var = this.f15815b;
                v0Var.f16185e = false;
                s0 s0Var = v0Var.f16189s;
                if (s0Var != null) {
                    s0Var.a(true);
                    v0Var.f16189s = null;
                }
                u0 u0Var = v0Var.f16187n;
                if (u0Var != null) {
                    u0Var.a();
                }
                v0Var.f16184c = false;
                v0Var.d();
                return;
            default:
                v0 v0Var2 = this.f15815b;
                if (v0Var2.f16184c && v0Var2.f16188r != null) {
                    v0Var2.f16187n.b(R.raw.error, 3500, LocaleController.getString("VideoConvertFail"));
                    v0Var2.f16184c = false;
                    v0Var2.d();
                    return;
                }
                return;
        }
    }
}
