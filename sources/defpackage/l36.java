package defpackage;

import android.animation.ValueAnimator;
public final class l36 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final o36 b;
    public final n36 c;

    public l36(o36 o36Var, n36 n36Var, byte b) {
        this.a = b;
        this.b = o36Var;
        this.c = n36Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        n36 n36Var = this.c;
        o36 o36Var = this.b;
        switch (b) {
            case 0:
                n36Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o36Var.invalidate();
                return;
            default:
                o36Var.getClass();
                n36Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o36Var.invalidate();
                return;
        }
    }
}
