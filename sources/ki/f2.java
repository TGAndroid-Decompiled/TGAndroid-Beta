package ki;

import android.animation.ValueAnimator;
public final class f2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f18754a;
    public final float f18755b;
    public final float f18756c;
    public final float d;
    public final float f18757e;
    public final t2 f18758f;

    public f2(t2 t2Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f18758f = t2Var;
        this.f18754a = z10;
        this.f18755b = f10;
        this.f18756c = f11;
        this.d = f12;
        this.f18757e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        t2 t2Var = this.f18758f;
        k2 k2Var = t2Var.E;
        q2 q2Var = t2Var.Y;
        j2 j2Var = t2Var.f19047x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t2Var.f19029i0 = floatValue;
        if (!this.f18754a) {
            floatValue = 1.0f - floatValue;
        }
        t2Var.f19028h0 = floatValue;
        q2Var.setAlpha(1.0f - floatValue);
        q2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * t2Var.f19028h0);
        float f10 = this.f18755b;
        float f11 = t2Var.f19029i0;
        float f12 = this.f18756c;
        j2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        j2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, t2Var.f19029i0));
        t2Var.f19034n0.setTranslationX(org.telegram.messenger.g0.T1(this.f18757e, 0.0f, t2Var.f19029i0));
        t2Var.f19035o0.setAlpha(t2Var.f19028h0);
        t2Var.f19025f.invalidate();
        k2Var.setViewPortHeightOffset(j2Var.getTranslationY() - f12);
        k2Var.n(false, false);
        t2Var.H();
    }
}
