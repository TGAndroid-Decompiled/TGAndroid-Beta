package defpackage;

import android.animation.ValueAnimator;
public final class kn4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final mn4 b;

    public kn4(mn4 mn4Var, byte b) {
        this.a = b;
        this.b = mn4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        mn4 mn4Var = this.b;
        switch (b) {
            case 0:
                mn4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn4Var.invalidate();
                return;
            case 1:
                mn4Var.getClass();
                mn4Var.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                mn4Var.invalidate();
                return;
            default:
                mn4Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mn4Var.invalidate();
                return;
        }
    }
}
