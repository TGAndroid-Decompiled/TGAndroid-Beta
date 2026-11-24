package defpackage;

import android.animation.ValueAnimator;
public final class sib implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final tib b;

    public sib(tib tibVar, byte b) {
        this.a = b;
        this.b = tibVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        tib tibVar = this.b;
        switch (b) {
            case 0:
                tibVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tibVar.invalidate();
                return;
            case 1:
                tibVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tibVar.invalidate();
                return;
            case 2:
                tibVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tibVar.invalidate();
                return;
            case 3:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tibVar.s = floatValue;
                tibVar.x = (int) ((tibVar.h * floatValue) + 0.0f);
                tibVar.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tibVar.w = floatValue2;
                int i = tibVar.r;
                tibVar.y = i + ((int) Math.ceil((tibVar.n - i) * floatValue2));
                tibVar.invalidate();
                return;
        }
    }
}
