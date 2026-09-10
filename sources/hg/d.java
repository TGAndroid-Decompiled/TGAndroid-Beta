package hg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f9325a;
    public final g f9326b;

    public d(g gVar, int i10) {
        this.f9325a = i10;
        this.f9326b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9325a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f9326b;
                gVar.f9369j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f9326b;
                gVar2.f9371k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f9326b;
                gVar3.f9384v0 = floatValue3;
                gVar3.f9382t0.setAlpha(gVar3.f9384v0);
                gVar3.invalidate();
                return;
        }
    }
}
