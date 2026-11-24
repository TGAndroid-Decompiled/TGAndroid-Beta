package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class xvb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final lwb b;

    public xvb(lwb lwbVar, byte b) {
        this.a = b;
        this.b = lwbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        byte b = this.a;
        lwb lwbVar = this.b;
        switch (b) {
            case 0:
                lwbVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lwbVar.a0 = floatValue;
                rkb rkbVar = lwbVar.S;
                if (floatValue > 0.0f) {
                    i = 0;
                } else {
                    i = 8;
                }
                rkbVar.setVisibility(i);
                rkbVar.setAlpha(floatValue);
                rkbVar.setTranslationY((1.0f - floatValue) * (-gl.L(8.0f)));
                lwbVar.b(floatValue);
                int L = gl.L(100.0f) + gl.m + ((int) (gl.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) lwbVar.r.getLayoutParams()).topMargin = L;
                View view = lwbVar.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                lwbVar.h.requestLayout();
                return;
            default:
                lwbVar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
