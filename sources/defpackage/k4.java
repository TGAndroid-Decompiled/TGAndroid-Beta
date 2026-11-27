package defpackage;

import android.animation.ValueAnimator;
public final class k4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final o4 b;

    public k4(o4 o4Var, byte b) {
        this.a = b;
        this.b = o4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        o4 o4Var = this.b;
        switch (b) {
            case 0:
                o4Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.invalidate();
                o4Var.P = null;
                return;
            case 1:
                o4Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o4Var.invalidate();
                o4Var.Q = null;
                return;
            default:
                o4Var.a0.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
