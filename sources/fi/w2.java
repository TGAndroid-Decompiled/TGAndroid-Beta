package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f9638a;
    public final float f9639b;
    public final float f9640c;
    public final float d;
    public final float e;
    public final k3 f9641f;

    public w2(k3 k3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f9641f = k3Var;
        this.f9638a = z10;
        this.f9639b = f7;
        this.f9640c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        k3 k3Var = this.f9641f;
        b3 b3Var = k3Var.f9384x;
        h3 h3Var = k3Var.W;
        a3 a3Var = k3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k3Var.f9364g0 = floatValue;
        if (!this.f9638a) {
            floatValue = 1.0f - floatValue;
        }
        k3Var.f9363f0 = floatValue;
        h3Var.setAlpha(1.0f - floatValue);
        h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * k3Var.f9363f0);
        float f7 = this.f9639b;
        float f10 = k3Var.f9364g0;
        float f11 = this.f9640c;
        a3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        a3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, k3Var.f9364g0));
        k3Var.f9369l0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, k3Var.f9364g0));
        k3Var.m0.setAlpha(k3Var.f9363f0);
        k3Var.e.invalidate();
        b3Var.setViewPortHeightOffset(a3Var.getTranslationY() - f11);
        b3Var.n(false, false);
        k3Var.D();
    }
}
