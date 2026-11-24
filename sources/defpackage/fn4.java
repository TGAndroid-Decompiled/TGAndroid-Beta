package defpackage;

import android.animation.ValueAnimator;
public final class fn4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final hn4 b;

    public fn4(hn4 hn4Var, byte b) {
        this.a = b;
        this.b = hn4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hn4 hn4Var = this.b;
        switch (b) {
            case 0:
                hn4Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hn4Var.invalidate();
                return;
            case 1:
                hn4Var.getClass();
                hn4Var.w = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                hn4Var.invalidate();
                return;
            default:
                hn4Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hn4Var.invalidate();
                return;
        }
    }
}
