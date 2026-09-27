package ig;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f11098a;
    public final g f11099b;

    public d(g gVar, int i10) {
        this.f11098a = i10;
        this.f11099b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11098a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f11099b;
                gVar.f11142j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f11099b;
                gVar2.f11144k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f11099b;
                gVar3.f11157v0 = floatValue3;
                gVar3.f11155t0.setAlpha(gVar3.f11157v0);
                gVar3.invalidate();
                return;
        }
    }
}
