package jg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f14425a;
    public final g f14426b;

    public d(g gVar, int i10) {
        this.f14425a = i10;
        this.f14426b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14425a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f14426b;
                gVar.f14469j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f14426b;
                gVar2.f14471k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f14426b;
                gVar3.f14484v0 = floatValue3;
                gVar3.f14482t0.setAlpha(gVar3.f14484v0);
                gVar3.invalidate();
                return;
        }
    }
}
