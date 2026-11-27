package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
public final class a0c implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final n0c b;

    public a0c(n0c n0cVar, byte b) {
        this.a = b;
        this.b = n0cVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        byte b = this.a;
        n0c n0cVar = this.b;
        switch (b) {
            case 0:
                n0cVar.b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0cVar.a0 = floatValue;
                qob qobVar = n0cVar.S;
                if (floatValue > 0.0f) {
                    i = 0;
                } else {
                    i = 8;
                }
                qobVar.setVisibility(i);
                qobVar.setAlpha(floatValue);
                qobVar.setTranslationY((1.0f - floatValue) * (-hl.L(8.0f)));
                n0cVar.b(floatValue);
                int L = hl.L(100.0f) + hl.m + ((int) (hl.L(36.0f) * floatValue));
                ((FrameLayout.LayoutParams) n0cVar.r.getLayoutParams()).topMargin = L;
                View view = n0cVar.F;
                if (view != null) {
                    ((FrameLayout.LayoutParams) view.getLayoutParams()).topMargin = L;
                }
                n0cVar.h.requestLayout();
                return;
            default:
                n0cVar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
