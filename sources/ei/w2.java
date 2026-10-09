package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f9460a;
    public final float f9461b;
    public final float f9462c;
    public final float d;
    public final float f9463e;
    public final k3 f9464f;

    public w2(k3 k3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f9464f = k3Var;
        this.f9460a = z10;
        this.f9461b = f7;
        this.f9462c = f10;
        this.d = f11;
        this.f9463e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        k3 k3Var = this.f9464f;
        b3 b3Var = k3Var.f9183x;
        h3 h3Var = k3Var.W;
        a3 a3Var = k3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k3Var.f9163g0 = floatValue;
        if (!this.f9460a) {
            floatValue = 1.0f - floatValue;
        }
        k3Var.f9162f0 = floatValue;
        h3Var.setAlpha(1.0f - floatValue);
        h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * k3Var.f9162f0);
        float f7 = this.f9461b;
        float f10 = k3Var.f9163g0;
        float f11 = this.f9462c;
        a3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        a3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, k3Var.f9163g0));
        k3Var.f9168l0.setTranslationX(AndroidUtilities.lerp(this.f9463e, 0.0f, k3Var.f9163g0));
        k3Var.m0.setAlpha(k3Var.f9162f0);
        k3Var.f9159e.invalidate();
        b3Var.setViewPortHeightOffset(a3Var.getTranslationY() - f11);
        b3Var.n(false, false);
        k3Var.D();
    }
}
