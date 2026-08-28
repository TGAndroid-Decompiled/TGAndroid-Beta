package mh;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f18031a;
    public final float f18032b;
    public final float f18033c;
    public final float d;
    public final float f18034e;
    public final c3 f18035f;

    public p2(c3 c3Var, boolean z10, float f10, float f11, float f12, float f13) {
        this.f18035f = c3Var;
        this.f18031a = z10;
        this.f18032b = f10;
        this.f18033c = f11;
        this.d = f12;
        this.f18034e = f13;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        c3 c3Var = this.f18035f;
        u2 u2Var = c3Var.f17778x;
        z2 z2Var = c3Var.S;
        t2 t2Var = c3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c3Var.f17752c0 = floatValue;
        if (!this.f18031a) {
            floatValue = 1.0f - floatValue;
        }
        c3Var.f17750b0 = floatValue;
        z2Var.setAlpha(1.0f - floatValue);
        z2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * c3Var.f17750b0);
        float f10 = this.f18032b;
        float f11 = c3Var.f17752c0;
        float f12 = this.f18033c;
        t2Var.setTranslationY(AndroidUtilities.lerp(f10, f12, f11));
        t2Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, c3Var.f17752c0));
        c3Var.f17759h0.setTranslationX(AndroidUtilities.lerp(this.f18034e, 0.0f, c3Var.f17752c0));
        c3Var.f17760i0.setAlpha(c3Var.f17750b0);
        c3Var.f17754e.invalidate();
        u2Var.setViewPortHeightOffset(t2Var.getTranslationY() - f12);
        u2Var.n(false, false);
        c3Var.C();
    }
}
