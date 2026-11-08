package hi;

import android.animation.ValueAnimator;
public final class n2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f14810a;
    public final float f14811b;
    public final float f14812c;
    public final float d;
    public final float f14813e;
    public final a3 f14814f;

    public n2(a3 a3Var, boolean z9, float f10, float f11, float f12, float f13) {
        this.f14814f = a3Var;
        this.f14810a = z9;
        this.f14811b = f10;
        this.f14812c = f11;
        this.d = f12;
        this.f14813e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        a3 a3Var = this.f14814f;
        s2 s2Var = a3Var.D;
        x2 x2Var = a3Var.X;
        r2 r2Var = a3Var.f14541x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        a3Var.f14522h0 = floatValue;
        if (!this.f14810a) {
            floatValue = 1.0f - floatValue;
        }
        a3Var.f14521g0 = floatValue;
        x2Var.setAlpha(1.0f - floatValue);
        x2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * a3Var.f14521g0);
        float f10 = this.f14811b;
        float f11 = a3Var.f14522h0;
        float f12 = this.f14812c;
        r2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        r2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, a3Var.f14522h0));
        a3Var.m0.setTranslationX(org.telegram.messenger.g0.T1(this.f14813e, 0.0f, a3Var.f14522h0));
        a3Var.f14528n0.setAlpha(a3Var.f14521g0);
        a3Var.f14519f.invalidate();
        s2Var.setViewPortHeightOffset(r2Var.getTranslationY() - f12);
        s2Var.n(false, false);
        a3Var.H();
    }
}
