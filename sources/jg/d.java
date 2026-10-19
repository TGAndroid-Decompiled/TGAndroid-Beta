package jg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f14423a;
    public final g f14424b;

    public d(g gVar, int i10) {
        this.f14423a = i10;
        this.f14424b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14423a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f14424b;
                gVar.f14467j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f14424b;
                gVar2.f14469k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f14424b;
                gVar3.f14482v0 = floatValue3;
                gVar3.f14480t0.setAlpha(gVar3.f14482v0);
                gVar3.invalidate();
                return;
        }
    }
}
