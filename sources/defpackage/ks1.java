package defpackage;

import android.app.Activity;
public final class ks1 extends je5 {
    public final mu1 X0;

    public ks1(mu1 mu1Var, Activity activity) {
        super(activity, 3);
        this.X0 = mu1Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setTranslationY(((-getTop()) - gl.L(120.0f)) + this.X0.R1);
    }
}
