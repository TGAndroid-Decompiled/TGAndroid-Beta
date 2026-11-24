package defpackage;

import android.app.Activity;
public final class ov9 extends mm3 {
    public final nk3 J0;
    public final Activity K0;
    public final sj3 L0;

    public ov9(sj3 sj3Var, Activity activity, nk3 nk3Var, int i, int i2, sc3 sc3Var, boolean z, nk3 nk3Var2, Activity activity2) {
        super(activity, nk3Var, i, i2, sc3Var, z);
        this.L0 = sj3Var;
        this.J0 = nk3Var2;
        this.K0 = activity2;
    }

    @Override
    public final void f() {
        pu9 pu9Var;
        int i = this.C0;
        super.f();
        sj3 sj3Var = this.L0;
        if (!sj3Var.L0 && (pu9Var = sj3Var.b0) != null) {
            pu9Var.w0(0);
            sj3Var.L0 = true;
        }
        if (b() != 0 || i == 0 || this.E0 > 0) {
            return;
        }
        sj3Var.c0.e(false, false);
    }
}
