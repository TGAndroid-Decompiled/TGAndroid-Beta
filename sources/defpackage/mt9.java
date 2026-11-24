package defpackage;

import android.app.Activity;
public final class mt9 extends bl3 {
    public final cj3 J0;
    public final Activity K0;
    public final hi3 L0;

    public mt9(hi3 hi3Var, Activity activity, cj3 cj3Var, int i, int i2, gb3 gb3Var, boolean z, cj3 cj3Var2, Activity activity2) {
        super(activity, cj3Var, i, i2, gb3Var, z);
        this.L0 = hi3Var;
        this.J0 = cj3Var2;
        this.K0 = activity2;
    }

    @Override
    public final void f() {
        ns9 ns9Var;
        int i = this.C0;
        super.f();
        hi3 hi3Var = this.L0;
        if (!hi3Var.L0 && (ns9Var = hi3Var.b0) != null) {
            ns9Var.w0(0);
            hi3Var.L0 = true;
        }
        if (b() != 0 || i == 0 || this.E0 > 0) {
            return;
        }
        hi3Var.c0.e(false, false);
    }
}
