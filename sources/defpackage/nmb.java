package defpackage;

import android.animation.ValueAnimator;
public final class nmb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final pmb b;

    public nmb(pmb pmbVar, byte b) {
        this.a = b;
        this.b = pmbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        pmb pmbVar = this.b;
        switch (b) {
            case 0:
                pmbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmbVar.invalidate();
                return;
            case 1:
                pmbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmbVar.invalidate();
                return;
            case 2:
                pmbVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmbVar.invalidate();
                return;
            case 3:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmbVar.s = floatValue;
                pmbVar.x = (int) ((pmbVar.h * floatValue) + 0.0f);
                pmbVar.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pmbVar.w = floatValue2;
                int i = pmbVar.r;
                pmbVar.y = i + ((int) Math.ceil((pmbVar.n - i) * floatValue2));
                pmbVar.invalidate();
                return;
        }
    }
}
