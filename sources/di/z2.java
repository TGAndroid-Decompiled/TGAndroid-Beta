package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class z2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f7057a;
    public final float f7058b;
    public final float f7059c;
    public final float d;
    public final float e;
    public final n3 f7060f;

    public z2(n3 n3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f7060f = n3Var;
        this.f7057a = z10;
        this.f7058b = f7;
        this.f7059c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        n3 n3Var = this.f7060f;
        e3 e3Var = n3Var.f6812x;
        k3 k3Var = n3Var.W;
        d3 d3Var = n3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        n3Var.f6792g0 = floatValue;
        if (!this.f7057a) {
            floatValue = 1.0f - floatValue;
        }
        n3Var.f6791f0 = floatValue;
        k3Var.setAlpha(1.0f - floatValue);
        k3Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * n3Var.f6791f0);
        float f7 = this.f7058b;
        float f10 = n3Var.f6792g0;
        float f11 = this.f7059c;
        d3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        d3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, n3Var.f6792g0));
        n3Var.f6797l0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, n3Var.f6792g0));
        n3Var.m0.setAlpha(n3Var.f6791f0);
        n3Var.e.invalidate();
        e3Var.setViewPortHeightOffset(d3Var.getTranslationY() - f11);
        e3Var.o(false, false);
        n3Var.C();
    }
}
