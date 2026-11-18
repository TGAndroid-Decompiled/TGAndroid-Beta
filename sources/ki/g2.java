package ki;

import android.animation.ValueAnimator;
public final class g2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f18694a;
    public final float f18695b;
    public final float f18696c;
    public final float d;
    public final float f18697e;
    public final t2 f18698f;

    public g2(t2 t2Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f18698f = t2Var;
        this.f18694a = z10;
        this.f18695b = f10;
        this.f18696c = f11;
        this.d = f12;
        this.f18697e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        t2 t2Var = this.f18698f;
        l2 l2Var = t2Var.E;
        q2 q2Var = t2Var.Y;
        k2 k2Var = t2Var.f18949x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t2Var.f18931i0 = floatValue;
        if (!this.f18694a) {
            floatValue = 1.0f - floatValue;
        }
        t2Var.f18930h0 = floatValue;
        q2Var.setAlpha(1.0f - floatValue);
        q2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * t2Var.f18930h0);
        float f10 = this.f18695b;
        float f11 = t2Var.f18931i0;
        float f12 = this.f18696c;
        k2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        k2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, t2Var.f18931i0));
        t2Var.f18936n0.setTranslationX(org.telegram.messenger.g0.T1(this.f18697e, 0.0f, t2Var.f18931i0));
        t2Var.f18937o0.setAlpha(t2Var.f18930h0);
        t2Var.f18927f.invalidate();
        l2Var.setViewPortHeightOffset(k2Var.getTranslationY() - f12);
        l2Var.n(false, false);
        t2Var.H();
    }
}
