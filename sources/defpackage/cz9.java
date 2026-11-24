package defpackage;

import android.animation.ValueAnimator;
public final class cz9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final fz9 b;

    public cz9(fz9 fz9Var, byte b) {
        this.a = b;
        this.b = fz9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fz9 fz9Var = this.b;
        switch (b) {
            case 0:
                fz9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fz9Var.W.i0.invalidate();
                return;
            case 1:
                fz9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fz9Var.W.i0.invalidate();
                return;
            default:
                fz9Var.O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fz9Var.W.i0.invalidate();
                return;
        }
    }
}
