package defpackage;

import android.app.Activity;
public final class gx9 extends tl3 {
    public final uj3 J0;
    public final Activity K0;
    public final bj3 L0;

    public gx9(bj3 bj3Var, Activity activity, uj3 uj3Var, int i, int i2, zb3 zb3Var, boolean z, uj3 uj3Var2, Activity activity2) {
        super(activity, uj3Var, i, i2, zb3Var, z);
        this.L0 = bj3Var;
        this.J0 = uj3Var2;
        this.K0 = activity2;
    }

    @Override
    public final void f() {
        gw9 gw9Var;
        int i = this.C0;
        super.f();
        bj3 bj3Var = this.L0;
        if (!bj3Var.L0 && (gw9Var = bj3Var.b0) != null) {
            gw9Var.x0(0);
            bj3Var.L0 = true;
        }
        if (b() != 0 || i == 0 || this.E0 > 0) {
            return;
        }
        bj3Var.c0.e(false, false);
    }
}
