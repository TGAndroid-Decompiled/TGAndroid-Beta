package ki;

import android.animation.ValueAnimator;
public final class k2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f18391a;
    public final float f18392b;
    public final float f18393c;
    public final float d;
    public final float f18394e;
    public final x2 f18395f;

    public k2(x2 x2Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f18395f = x2Var;
        this.f18391a = z10;
        this.f18392b = f10;
        this.f18393c = f11;
        this.d = f12;
        this.f18394e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        x2 x2Var = this.f18395f;
        p2 p2Var = x2Var.E;
        u2 u2Var = x2Var.Y;
        o2 o2Var = x2Var.f18683x;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x2Var.f18665i0 = floatValue;
        if (!this.f18391a) {
            floatValue = 1.0f - floatValue;
        }
        x2Var.f18664h0 = floatValue;
        u2Var.setAlpha(1.0f - floatValue);
        u2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * x2Var.f18664h0);
        float f10 = this.f18392b;
        float f11 = x2Var.f18665i0;
        float f12 = this.f18393c;
        o2Var.setTranslationY(org.telegram.messenger.g0.T1(f10, f12, f11));
        o2Var.setTranslationX(org.telegram.messenger.g0.T1(this.d, 0.0f, x2Var.f18665i0));
        x2Var.f18670n0.setTranslationX(org.telegram.messenger.g0.T1(this.f18394e, 0.0f, x2Var.f18665i0));
        x2Var.f18671o0.setAlpha(x2Var.f18664h0);
        x2Var.f18661f.invalidate();
        p2Var.setViewPortHeightOffset(o2Var.getTranslationY() - f12);
        p2Var.n(false, false);
        x2Var.H();
    }
}
