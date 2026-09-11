package jg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f13631a;
    public final g f13632b;

    public d(g gVar, int i10) {
        this.f13631a = i10;
        this.f13632b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13631a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f13632b;
                gVar.f13677j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f13632b;
                gVar2.f13679k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f13632b;
                gVar3.f13692v0 = floatValue3;
                gVar3.f13690t0.setAlpha(gVar3.f13692v0);
                gVar3.invalidate();
                return;
        }
    }
}
