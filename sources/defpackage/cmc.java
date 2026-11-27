package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
public final class cmc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public cmc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                View view = (View) obj2;
                View view2 = (View) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = 1.0f - floatValue;
                view.setTranslationY(hl.L(8.0f) * f);
                view.setAlpha(floatValue);
                view2.setTranslationY((-hl.L(6.0f)) * floatValue);
                view2.setAlpha(f);
                return;
            case 1:
                wmc wmcVar = (wmc) obj2;
                kjc kjcVar = (kjc) obj;
                kjcVar.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                kjcVar.c();
                int i = kjcVar.h;
                if (((i >= 0 && i <= 2) || (i >= 180 && i <= 182)) && wmcVar.S) {
                    wmcVar.R.pause();
                    AnimatorSet animatorSet = wmcVar.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((ync) obj2).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((m12) obj).invalidate();
                return;
            default:
                foc focVar = (foc) obj2;
                int i2 = focVar.e;
                focVar.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (focVar.c - i2)) + i2);
                int i3 = focVar.f;
                focVar.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (focVar.d - i3)) + i3);
                ((tmc) obj).invalidate();
                return;
        }
    }
}
