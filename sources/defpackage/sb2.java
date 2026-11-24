package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
public final class sb2 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final wb2 c;
    public final View d;

    public sb2(wb2 wb2Var, View view, float f, byte b) {
        this.a = b;
        this.c = wb2Var;
        this.d = view;
        this.b = f;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.b;
        float f2 = 0.0f;
        View view = this.d;
        wb2 wb2Var = this.c;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1 yv1Var = wb2Var.F;
                er0 er0Var = (er0) view;
                float measuredHeight = ((((wb2Var.G.getMeasuredHeight() - yv1Var.P9) - yv1Var.Ya) / 2.0f) - (er0Var.getMeasuredHeight() / 2.0f)) + yv1Var.P9;
                if (er0Var.getTop() > measuredHeight) {
                    f2 = measuredHeight - er0Var.getTop();
                }
                er0Var.setTranslationY((f2 * floatValue) + ((1.0f - floatValue) * f));
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1 yv1Var2 = wb2Var.F;
                h9c h9cVar = (h9c) view;
                float measuredHeight2 = ((((wb2Var.G.getMeasuredHeight() - yv1Var2.P9) - yv1Var2.Ya) / 2.0f) - (h9cVar.getMeasuredHeight() / 2.0f)) + yv1Var2.P9;
                if (h9cVar.getTop() > measuredHeight2) {
                    f2 = measuredHeight2 - h9cVar.getTop();
                }
                h9cVar.setTranslationY((f2 * floatValue2) + ((1.0f - floatValue2) * f));
                return;
        }
    }
}
