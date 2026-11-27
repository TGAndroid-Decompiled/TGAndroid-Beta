package defpackage;

import android.app.Activity;
public final class wp1 extends dl1 {
    public final zu1 z2;

    public wp1(zu1 zu1Var, vnb vnbVar, Activity activity) {
        super(vnbVar, activity, false);
        this.z2 = zu1Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float y = getY();
        zu1 zu1Var = this.z2;
        j0(zu1Var.g1.getY() + y, zu1Var.m1.getBackgroundSizeY());
    }
}
