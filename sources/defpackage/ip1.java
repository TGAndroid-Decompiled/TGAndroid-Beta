package defpackage;

import android.app.Activity;
public final class ip1 extends uk1 {
    public final mu1 z2;

    public ip1(mu1 mu1Var, wjb wjbVar, Activity activity) {
        super(wjbVar, activity, false);
        this.z2 = mu1Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        mu1 mu1Var = this.z2;
        k0(mu1Var.g1.getY() + y, mu1Var.m1.getBackgroundSizeY());
    }
}
