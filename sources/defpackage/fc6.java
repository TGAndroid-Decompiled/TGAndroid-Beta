package defpackage;

import android.animation.ValueAnimator;
public final class fc6 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final mf6 b;

    public fc6(mf6 mf6Var, byte b) {
        this.a = b;
        this.b = mf6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        mf6 mf6Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mf6Var.c.setAlpha(floatValue);
                mf6Var.c.setTranslationY((1.0f - floatValue) * gl.L(230.0f));
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = (0.9f * floatValue2) + 0.1f;
                mf6Var.W.setScaleX(f);
                mf6Var.W.setScaleY(f);
                mf6Var.W.setAlpha(floatValue2);
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mf6Var.c.setAlpha(floatValue3);
                mf6Var.c.setTranslationY((1.0f - floatValue3) * gl.L(230.0f));
                return;
        }
    }
}
