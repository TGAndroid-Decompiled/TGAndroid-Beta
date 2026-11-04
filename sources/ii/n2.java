package ii;

import android.animation.ValueAnimator;
public final class n2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f15095a;
    public final float f15096b;
    public final float f15097c;
    public final float d;
    public final float f15098e;
    public final a3 f15099f;

    public n2(a3 a3Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f15099f = a3Var;
        this.f15095a = z10;
        this.f15096b = f10;
        this.f15097c = f11;
        this.d = f12;
        this.f15098e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a3 a3Var = this.f15099f;
        s2 s2Var = a3Var.E;
        x2 x2Var = a3Var.Y;
        r2 r2Var = a3Var.f14824x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a3Var.f14806i0 = floatValue;
        if (!this.f15095a) {
            floatValue = 1.0f - floatValue;
        }
        a3Var.f14805h0 = floatValue;
        x2Var.setAlpha(1.0f - floatValue);
        x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * a3Var.f14805h0);
        float f10 = this.f15096b;
        float f11 = a3Var.f14806i0;
        float f12 = this.f15097c;
        r2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        r2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, a3Var.f14806i0));
        a3Var.f14811n0.setTranslationX(org.telegram.messenger.g0.T1(this.f15098e, 0.0f, a3Var.f14806i0));
        a3Var.f14812o0.setAlpha(a3Var.f14805h0);
        a3Var.f14802f.invalidate();
        s2Var.setViewPortHeightOffset(r2Var.getTranslationY() - f12);
        s2Var.n(false, false);
        a3Var.H();
    }
}
