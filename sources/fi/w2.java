package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f10088a;
    public final float f10089b;
    public final float f10090c;
    public final float d;
    public final float f10091e;
    public final k3 f10092f;

    public w2(k3 k3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f10092f = k3Var;
        this.f10088a = z10;
        this.f10089b = f7;
        this.f10090c = f10;
        this.d = f11;
        this.f10091e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        k3 k3Var = this.f10092f;
        b3 b3Var = k3Var.f9817x;
        h3 h3Var = k3Var.W;
        a3 a3Var = k3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k3Var.f9797g0 = floatValue;
        if (!this.f10088a) {
            floatValue = 1.0f - floatValue;
        }
        k3Var.f9796f0 = floatValue;
        h3Var.setAlpha(1.0f - floatValue);
        h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * k3Var.f9796f0);
        float f7 = this.f10089b;
        float f10 = k3Var.f9797g0;
        float f11 = this.f10090c;
        a3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        a3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, k3Var.f9797g0));
        k3Var.f9802l0.setTranslationX(AndroidUtilities.lerp(this.f10091e, 0.0f, k3Var.f9797g0));
        k3Var.m0.setAlpha(k3Var.f9796f0);
        k3Var.f9793e.invalidate();
        b3Var.setViewPortHeightOffset(a3Var.getTranslationY() - f11);
        b3Var.o(false, false);
        k3Var.C();
    }
}
