package jg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f14418a;
    public final g f14419b;

    public d(g gVar, int i10) {
        this.f14418a = i10;
        this.f14419b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14418a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f14419b;
                gVar.f14462j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f14419b;
                gVar2.f14464k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f14419b;
                gVar3.f14477v0 = floatValue3;
                gVar3.f14475t0.setAlpha(gVar3.f14477v0);
                gVar3.invalidate();
                return;
        }
    }
}
