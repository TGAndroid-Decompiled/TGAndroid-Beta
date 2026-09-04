package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
public final class w2 implements ValueAnimator.AnimatorUpdateListener {
    public final boolean f10060a;
    public final float f10061b;
    public final float f10062c;
    public final float d;
    public final float f10063e;
    public final k3 f10064f;

    public w2(k3 k3Var, boolean z10, float f7, float f10, float f11, float f12) {
        this.f10064f = k3Var;
        this.f10060a = z10;
        this.f10061b = f7;
        this.f10062c = f10;
        this.d = f11;
        this.f10063e = f12;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        k3 k3Var = this.f10064f;
        b3 b3Var = k3Var.f9789x;
        h3 h3Var = k3Var.W;
        a3 a3Var = k3Var.v;
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        k3Var.f9769g0 = floatValue;
        if (!this.f10060a) {
            floatValue = 1.0f - floatValue;
        }
        k3Var.f9768f0 = floatValue;
        h3Var.setAlpha(1.0f - floatValue);
        h3Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * k3Var.f9768f0);
        float f7 = this.f10061b;
        float f10 = k3Var.f9769g0;
        float f11 = this.f10062c;
        a3Var.setTranslationY(AndroidUtilities.lerp(f7, f11, f10));
        a3Var.setTranslationX(AndroidUtilities.lerp(this.d, 0.0f, k3Var.f9769g0));
        k3Var.f9774l0.setTranslationX(AndroidUtilities.lerp(this.f10063e, 0.0f, k3Var.f9769g0));
        k3Var.m0.setAlpha(k3Var.f9768f0);
        k3Var.f9765e.invalidate();
        b3Var.setViewPortHeightOffset(a3Var.getTranslationY() - f11);
        b3Var.o(false, false);
        k3Var.C();
    }
}
