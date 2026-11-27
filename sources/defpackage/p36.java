package defpackage;

import android.animation.ValueAnimator;
public final class p36 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final s36 b;
    public final r36 c;

    public p36(s36 s36Var, r36 r36Var, byte b) {
        this.a = b;
        this.b = s36Var;
        this.c = r36Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        r36 r36Var = this.c;
        s36 s36Var = this.b;
        switch (b) {
            case 0:
                r36Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s36Var.invalidate();
                return;
            default:
                s36Var.getClass();
                r36Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s36Var.invalidate();
                return;
        }
    }
}
