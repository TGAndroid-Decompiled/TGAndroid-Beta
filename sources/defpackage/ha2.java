package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class ha2 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final la2 c;
    public final View d;

    public ha2(la2 la2Var, View view, float f, byte b) {
        this.a = b;
        this.c = la2Var;
        this.d = view;
        this.b = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.b;
        float f2 = 0.0f;
        View view = this.d;
        la2 la2Var = this.c;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1 mu1Var = la2Var.F;
                eq0 eq0Var = (eq0) view;
                float measuredHeight = ((((la2Var.G.getMeasuredHeight() - mu1Var.P9) - mu1Var.Ya) / 2.0f) - (eq0Var.getMeasuredHeight() / 2.0f)) + mu1Var.P9;
                if (eq0Var.getTop() > measuredHeight) {
                    f2 = measuredHeight - eq0Var.getTop();
                }
                eq0Var.setTranslationY((f2 * floatValue) + ((1.0f - floatValue) * f));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1 mu1Var2 = la2Var.F;
                g7c g7cVar = (g7c) view;
                float measuredHeight2 = ((((la2Var.G.getMeasuredHeight() - mu1Var2.P9) - mu1Var2.Ya) / 2.0f) - (g7cVar.getMeasuredHeight() / 2.0f)) + mu1Var2.P9;
                if (g7cVar.getTop() > measuredHeight2) {
                    f2 = measuredHeight2 - g7cVar.getTop();
                }
                g7cVar.setTranslationY((f2 * floatValue2) + ((1.0f - floatValue2) * f));
                return;
        }
    }
}
