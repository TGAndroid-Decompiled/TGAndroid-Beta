package defpackage;

import android.app.Activity;
public final class xt1 extends hg5 {
    public final yv1 X0;

    public xt1(yv1 yv1Var, Activity activity) {
        super(activity, 3);
        this.X0 = yv1Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setTranslationY(((-getTop()) - gm.L(120.0f)) + this.X0.R1);
    }
}
