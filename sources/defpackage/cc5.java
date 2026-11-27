package defpackage;

import android.app.Activity;
public final class cc5 extends l46 {
    public final dc5 S2;

    public cc5(dc5 dc5Var, dc5 dc5Var2, Activity activity, int i, int i2, vnb vnbVar) {
        super(i, i2, vnbVar, activity, dc5Var2);
        this.S2 = dc5Var;
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
