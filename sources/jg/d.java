package jg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f14468a;
    public final g f14469b;

    public d(g gVar, int i10) {
        this.f14468a = i10;
        this.f14469b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14468a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f14469b;
                gVar.f14512j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f14469b;
                gVar2.f14514k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f14469b;
                gVar3.f14527v0 = floatValue3;
                gVar3.f14525t0.setAlpha(gVar3.f14527v0);
                gVar3.invalidate();
                return;
        }
    }
}
