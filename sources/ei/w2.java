package ei;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f8688a;
    public final float f8689b;
    public final float f8690c;
    public final float d;
    public final float e;
    public final k3 f8691f;

    public w2(k3 k3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f8691f = k3Var;
        this.f8688a = z10;
        this.f8689b = f7;
        this.f8690c = f10;
        this.d = f11;
        this.e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        k3 k3Var = this.f8691f;
        b3 b3Var = k3Var.f8439x;
        h3 h3Var = k3Var.W;
        a3 a3Var = k3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k3Var.f8419g0 = floatValue;
        if (!this.f8688a) {
            floatValue = 1.0f - floatValue;
        }
        k3Var.f8418f0 = floatValue;
        h3Var.setAlpha(1.0f - floatValue);
        h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * k3Var.f8418f0);
        float f7 = this.f8689b;
        float f10 = k3Var.f8419g0;
        float f11 = this.f8690c;
        a3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        a3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, k3Var.f8419g0));
        k3Var.f8424l0.setTranslationX(AndroidUtilities.lerp(this.e, 0.0f, k3Var.f8419g0));
        k3Var.m0.setAlpha(k3Var.f8418f0);
        k3Var.e.invalidate();
        b3Var.setViewPortHeightOffset(a3Var.getTranslationY() - f11);
        b3Var.o(false, false);
        k3Var.C();
    }
}
