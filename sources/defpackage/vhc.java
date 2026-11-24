package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
public final class vhc implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public vhc(Object obj, Object obj2, byte b) {
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
                view.setTranslationY(gl.L(8.0f) * f);
                view.setAlpha(floatValue);
                view2.setTranslationY((-gl.L(6.0f)) * floatValue);
                view2.setAlpha(f);
                return;
            case 1:
                kic kicVar = (kic) obj2;
                lfc lfcVar = (lfc) obj;
                lfcVar.h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                lfcVar.c();
                int i = lfcVar.h;
                if (((i >= 0 && i <= 2) || (i >= 180 && i <= 182)) && kicVar.S) {
                    kicVar.R.pause();
                    AnimatorSet animatorSet = kicVar.Q;
                    if (animatorSet != null) {
                        animatorSet.pause();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((mjc) obj2).d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ((w02) obj).invalidate();
                return;
            default:
                sjc sjcVar = (sjc) obj2;
                int i2 = sjcVar.e;
                sjcVar.g = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (sjcVar.c - i2)) + i2);
                int i3 = sjcVar.f;
                sjcVar.h = (int) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * (sjcVar.d - i3)) + i3);
                ((hic) obj).invalidate();
                return;
        }
    }
}
