package defpackage;

import android.animation.ValueAnimator;
public final class tkb implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ukb b;

    public tkb(ukb ukbVar, byte b) {
        this.a = b;
        this.b = ukbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ukb ukbVar = this.b;
        switch (b) {
            case 0:
                ukbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ukbVar.invalidate();
                return;
            case 1:
                ukbVar.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ukbVar.invalidate();
                return;
            case 2:
                ukbVar.f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ukbVar.invalidate();
                return;
            case 3:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ukbVar.s = floatValue;
                ukbVar.x = (int) ((ukbVar.h * floatValue) + 0.0f);
                ukbVar.invalidate();
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ukbVar.w = floatValue2;
                int i = ukbVar.r;
                ukbVar.y = i + ((int) Math.ceil((ukbVar.n - i) * floatValue2));
                ukbVar.invalidate();
                return;
        }
    }
}
