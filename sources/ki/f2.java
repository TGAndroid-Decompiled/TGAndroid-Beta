package ki;

import android.animation.ValueAnimator;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f18673a;
    public final float f18674b;
    public final float f18675c;
    public final float d;
    public final float f18676e;
    public final s2 f18677f;

    public f2(s2 s2Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f18677f = s2Var;
        this.f18673a = z10;
        this.f18674b = f10;
        this.f18675c = f11;
        this.d = f12;
        this.f18676e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        s2 s2Var = this.f18677f;
        k2 k2Var = s2Var.E;
        p2 p2Var = s2Var.Y;
        j2 j2Var = s2Var.f18928x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        s2Var.f18910i0 = floatValue;
        if (!this.f18673a) {
            floatValue = 1.0f - floatValue;
        }
        s2Var.f18909h0 = floatValue;
        p2Var.setAlpha(1.0f - floatValue);
        p2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * s2Var.f18909h0);
        float f10 = this.f18674b;
        float f11 = s2Var.f18910i0;
        float f12 = this.f18675c;
        j2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        j2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, s2Var.f18910i0));
        s2Var.f18915n0.setTranslationX(org.telegram.messenger.g0.T1(this.f18676e, 0.0f, s2Var.f18910i0));
        s2Var.f18916o0.setAlpha(s2Var.f18909h0);
        s2Var.f18906f.invalidate();
        k2Var.setViewPortHeightOffset(j2Var.getTranslationY() - f12);
        k2Var.n(false, false);
        s2Var.H();
    }
}
