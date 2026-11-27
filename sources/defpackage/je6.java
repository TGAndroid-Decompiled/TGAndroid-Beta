package defpackage;

import android.animation.ValueAnimator;
public final class je6 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final qh6 b;

    public je6(qh6 qh6Var, byte b) {
        this.a = b;
        this.b = qh6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        qh6 qh6Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh6Var.c.setAlpha(floatValue);
                qh6Var.c.setTranslationY((1.0f - floatValue) * hl.L(230.0f));
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qh6Var.c.setAlpha(floatValue2);
                qh6Var.c.setTranslationY((1.0f - floatValue2) * hl.L(230.0f));
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = (0.9f * floatValue3) + 0.1f;
                qh6Var.W.setScaleX(f);
                qh6Var.W.setScaleY(f);
                qh6Var.W.setAlpha(floatValue3);
                return;
        }
    }
}
