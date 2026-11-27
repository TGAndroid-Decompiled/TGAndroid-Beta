package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class xa2 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final bb2 c;
    public final View d;

    public xa2(bb2 bb2Var, View view, float f, byte b) {
        this.a = b;
        this.c = bb2Var;
        this.d = view;
        this.b = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.b;
        float f2 = 0.0f;
        View view = this.d;
        bb2 bb2Var = this.c;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1 zu1Var = bb2Var.F;
                eq0 eq0Var = (eq0) view;
                float measuredHeight = ((((bb2Var.G.getMeasuredHeight() - zu1Var.P9) - zu1Var.Ya) / 2.0f) - (eq0Var.getMeasuredHeight() / 2.0f)) + zu1Var.P9;
                if (eq0Var.getTop() > measuredHeight) {
                    f2 = measuredHeight - eq0Var.getTop();
                }
                eq0Var.setTranslationY((f2 * floatValue) + ((1.0f - floatValue) * f));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1 zu1Var2 = bb2Var.F;
                gbc gbcVar = (gbc) view;
                float measuredHeight2 = ((((bb2Var.G.getMeasuredHeight() - zu1Var2.P9) - zu1Var2.Ya) / 2.0f) - (gbcVar.getMeasuredHeight() / 2.0f)) + zu1Var2.P9;
                if (gbcVar.getTop() > measuredHeight2) {
                    f2 = measuredHeight2 - gbcVar.getTop();
                }
                gbcVar.setTranslationY((f2 * floatValue2) + ((1.0f - floatValue2) * f));
                return;
        }
    }
}
