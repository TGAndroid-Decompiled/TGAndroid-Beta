package jg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f13657a;
    public final g f13658b;

    public d(g gVar, int i10) {
        this.f13657a = i10;
        this.f13658b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13657a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f13658b;
                gVar.f13703j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f13658b;
                gVar2.f13705k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f13658b;
                gVar3.f13718v0 = floatValue3;
                gVar3.f13716t0.setAlpha(gVar3.f13718v0);
                gVar3.invalidate();
                return;
        }
    }
}
