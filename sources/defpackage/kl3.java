package defpackage;

import android.animation.ValueAnimator;
public final class kl3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ml3 b;

    public kl3(ml3 ml3Var, byte b) {
        this.a = b;
        this.b = ml3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ml3 ml3Var = this.b;
        switch (b) {
            case 0:
                ml3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ml3Var.requestLayout();
                gu2 gu2Var = ml3Var.c;
                if (gu2Var != null) {
                    gu2Var.accept(Float.valueOf(ml3Var.a));
                    return;
                }
                return;
            default:
                ml3Var.getClass();
                ml3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ml3Var.requestLayout();
                gu2 gu2Var2 = ml3Var.c;
                if (gu2Var2 != null) {
                    gu2Var2.accept(Float.valueOf(ml3Var.a));
                    return;
                }
                return;
        }
    }
}
