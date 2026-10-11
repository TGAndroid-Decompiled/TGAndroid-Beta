package ig;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f12132a;
    public final g f12133b;

    public d(g gVar, int i10) {
        this.f12132a = i10;
        this.f12133b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12132a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f12133b;
                gVar.f12178j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f12133b;
                gVar2.f12180k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f12133b;
                gVar3.f12193v0 = floatValue3;
                gVar3.f12191t0.setAlpha(gVar3.f12193v0);
                gVar3.invalidate();
                return;
        }
    }
}
