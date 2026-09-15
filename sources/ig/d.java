package ig;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f11105a;
    public final g f11106b;

    public d(g gVar, int i10) {
        this.f11105a = i10;
        this.f11106b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11105a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f11106b;
                gVar.f11149j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f11106b;
                gVar2.f11151k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f11106b;
                gVar3.f11164v0 = floatValue3;
                gVar3.f11162t0.setAlpha(gVar3.f11164v0);
                gVar3.invalidate();
                return;
        }
    }
}
