package jg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f13007a;
    public final g f13008b;

    public d(g gVar, int i10) {
        this.f13007a = i10;
        this.f13008b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13007a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f13008b;
                gVar.f13051j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f13008b;
                gVar2.f13053k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f13008b;
                gVar3.f13066v0 = floatValue3;
                gVar3.f13064t0.setAlpha(gVar3.f13066v0);
                gVar3.invalidate();
                return;
        }
    }
}
