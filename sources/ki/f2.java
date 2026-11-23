package ki;

import android.animation.ValueAnimator;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f18707a;
    public final float f18708b;
    public final float f18709c;
    public final float d;
    public final float f18710e;
    public final s2 f18711f;

    public f2(s2 s2Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f18711f = s2Var;
        this.f18707a = z10;
        this.f18708b = f10;
        this.f18709c = f11;
        this.d = f12;
        this.f18710e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        s2 s2Var = this.f18711f;
        k2 k2Var = s2Var.E;
        p2 p2Var = s2Var.Y;
        j2 j2Var = s2Var.f18962x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        s2Var.f18944i0 = floatValue;
        if (!this.f18707a) {
            floatValue = 1.0f - floatValue;
        }
        s2Var.f18943h0 = floatValue;
        p2Var.setAlpha(1.0f - floatValue);
        p2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * s2Var.f18943h0);
        float f10 = this.f18708b;
        float f11 = s2Var.f18944i0;
        float f12 = this.f18709c;
        j2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        j2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, s2Var.f18944i0));
        s2Var.f18949n0.setTranslationX(org.telegram.messenger.g0.T1(this.f18710e, 0.0f, s2Var.f18944i0));
        s2Var.f18950o0.setAlpha(s2Var.f18943h0);
        s2Var.f18940f.invalidate();
        k2Var.setViewPortHeightOffset(j2Var.getTranslationY() - f12);
        k2Var.n(false, false);
        s2Var.H();
    }
}
