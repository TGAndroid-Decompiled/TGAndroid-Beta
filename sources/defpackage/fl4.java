package defpackage;

import android.animation.ValueAnimator;
public final class fl4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final hl4 b;

    public fl4(hl4 hl4Var, byte b) {
        this.a = b;
        this.b = hl4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hl4 hl4Var = this.b;
        switch (b) {
            case 0:
                hl4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hl4Var.invalidate();
                return;
            case 1:
                hl4Var.getClass();
                hl4Var.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hl4Var.invalidate();
                return;
            default:
                hl4Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hl4Var.invalidate();
                return;
        }
    }
}
