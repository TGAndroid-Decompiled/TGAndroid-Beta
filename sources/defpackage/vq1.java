package defpackage;

import android.app.Activity;
public final class vq1 extends cm1 {
    public final yv1 z2;

    public vq1(yv1 yv1Var, ylb ylbVar, Activity activity) {
        super(ylbVar, activity, false);
        this.z2 = yv1Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        yv1 yv1Var = this.z2;
        j0(yv1Var.g1.getY() + y, yv1Var.m1.getBackgroundSizeY());
    }
}
