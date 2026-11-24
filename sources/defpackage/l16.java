package defpackage;

import android.animation.ValueAnimator;
public final class l16 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final o16 b;
    public final n16 c;

    public l16(o16 o16Var, n16 n16Var, byte b) {
        this.a = b;
        this.b = o16Var;
        this.c = n16Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        n16 n16Var = this.c;
        o16 o16Var = this.b;
        switch (b) {
            case 0:
                n16Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o16Var.invalidate();
                return;
            default:
                o16Var.getClass();
                n16Var.c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o16Var.invalidate();
                return;
        }
    }
}
