package defpackage;

import android.app.Activity;
public final class ys1 extends kg5 {
    public final zu1 X0;

    public ys1(zu1 zu1Var, Activity activity) {
        super(activity, 3);
        this.X0 = zu1Var;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setTranslationY(((-getTop()) - hl.L(120.0f)) + this.X0.R1);
    }
}
