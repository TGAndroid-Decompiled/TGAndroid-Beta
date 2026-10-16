package jg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f13011a;
    public final g f13012b;

    public d(g gVar, int i10) {
        this.f13011a = i10;
        this.f13012b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13011a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f13012b;
                gVar.f13055j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f13012b;
                gVar2.f13057k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f13012b;
                gVar3.f13070v0 = floatValue3;
                gVar3.f13068t0.setAlpha(gVar3.f13070v0);
                gVar3.invalidate();
                return;
        }
    }
}
