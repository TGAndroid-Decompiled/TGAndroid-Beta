package defpackage;

import android.animation.ValueAnimator;
public final class ax9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final dx9 b;

    public ax9(dx9 dx9Var, byte b) {
        this.a = b;
        this.b = dx9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dx9 dx9Var = this.b;
        switch (b) {
            case 0:
                dx9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx9Var.W.i0.invalidate();
                return;
            case 1:
                dx9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx9Var.W.i0.invalidate();
                return;
            default:
                dx9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx9Var.W.i0.invalidate();
                return;
        }
    }
}
