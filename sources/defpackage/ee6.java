package defpackage;

import android.animation.ValueAnimator;
public final class ee6 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final mh6 b;

    public ee6(mh6 mh6Var, byte b) {
        this.a = b;
        this.b = mh6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        mh6 mh6Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh6Var.c.setAlpha(floatValue);
                mh6Var.c.setTranslationY((1.0f - floatValue) * gm.L(230.0f));
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = (0.9f * floatValue2) + 0.1f;
                mh6Var.W.setScaleX(f);
                mh6Var.W.setScaleY(f);
                mh6Var.W.setAlpha(floatValue2);
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mh6Var.c.setAlpha(floatValue3);
                mh6Var.c.setTranslationY((1.0f - floatValue3) * gm.L(230.0f));
                return;
        }
    }
}
