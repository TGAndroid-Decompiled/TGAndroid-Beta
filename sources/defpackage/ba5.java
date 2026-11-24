package defpackage;

import android.app.Activity;
public final class ba5 extends h26 {
    public final ca5 S2;

    public ba5(ca5 ca5Var, ca5 ca5Var2, Activity activity, int i, int i2, wjb wjbVar) {
        super(i, i2, wjbVar, activity, ca5Var2);
        this.S2 = ca5Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.S2.C0 = false;
    }

    @Override
    public final void x() {
        this.S2.C0 = false;
    }
}
