package defpackage;

import android.animation.ValueAnimator;
public final class rc8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final tc8 b;

    public rc8(tc8 tc8Var, byte b) {
        this.a = b;
        this.b = tc8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        tc8 tc8Var = this.b;
        switch (b) {
            case 0:
                tc8Var.getClass();
                tc8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tc8Var.invalidate();
                return;
            default:
                tc8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tc8Var.invalidate();
                return;
        }
    }
}
