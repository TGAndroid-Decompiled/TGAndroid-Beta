package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
public final class vjc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public vjc(Object obj, Object obj2, byte b) {
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
                view.setTranslationY(gm.L(8.0f) * f);
                view.setAlpha(floatValue);
                view2.setTranslationY((-gm.L(6.0f)) * floatValue);
                view2.setAlpha(f);
                return;
            case 1:
                kkc kkcVar = (kkc) obj2;
                lhc lhcVar = (lhc) obj;
                lhcVar.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                lhcVar.c();
                int i = lhcVar.h;
                if (((i >= 0 && i <= 2) || (i >= 180 && i <= 182)) && kkcVar.S) {
                    kkcVar.R.pause();
                    AnimatorSet animatorSet = kkcVar.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((mlc) obj2).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((h22) obj).invalidate();
                return;
            default:
                slc slcVar = (slc) obj2;
                int i2 = slcVar.e;
                slcVar.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (slcVar.c - i2)) + i2);
                int i3 = slcVar.f;
                slcVar.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (slcVar.d - i3)) + i3);
                ((hkc) obj).invalidate();
                return;
        }
    }
}
