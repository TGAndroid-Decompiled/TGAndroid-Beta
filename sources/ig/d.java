package ig;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f12086a;
    public final g f12087b;

    public d(g gVar, int i10) {
        this.f12086a = i10;
        this.f12087b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12086a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f12087b;
                gVar.f12132j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f12087b;
                gVar2.f12134k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f12087b;
                gVar3.f12147v0 = floatValue3;
                gVar3.f12145t0.setAlpha(gVar3.f12147v0);
                gVar3.invalidate();
                return;
        }
    }
}
