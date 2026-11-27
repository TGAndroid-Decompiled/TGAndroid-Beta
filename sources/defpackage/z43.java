package defpackage;

import android.animation.ValueAnimator;
public final class z43 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final e53 b;

    public z43(e53 e53Var, byte b) {
        this.a = b;
        this.b = e53Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        e53 e53Var = this.b;
        switch (b) {
            case 0:
                e53Var.getClass();
                e53Var.a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                e53Var.a.invalidate();
                return;
        }
    }
}
