package defpackage;

import android.animation.ValueAnimator;
public final class s62 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final w62 b;

    public s62(w62 w62Var, byte b) {
        this.a = b;
        this.b = w62Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        w62 w62Var = this.b;
        switch (b) {
            case 0:
                w62Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w62Var.invalidate();
                return;
            default:
                w62Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w62Var.invalidate();
                return;
        }
    }
}
