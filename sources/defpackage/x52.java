package defpackage;

import android.animation.ValueAnimator;
public final class x52 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final b62 b;

    public x52(b62 b62Var, byte b) {
        this.a = b;
        this.b = b62Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        b62 b62Var = this.b;
        switch (b) {
            case 0:
                b62Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b62Var.invalidate();
                return;
            default:
                b62Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b62Var.invalidate();
                return;
        }
    }
}
