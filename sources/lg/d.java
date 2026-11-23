package lg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f19858a;
    public final g f19859b;

    public d(g gVar, int i7) {
        this.f19858a = i7;
        this.f19859b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19858a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f19859b;
                gVar.f19904k0 = floatValue;
                gVar.I = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f19859b;
                gVar2.f19906l0 = floatValue2;
                gVar2.I = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f19859b;
                gVar3.f19920w0 = floatValue3;
                gVar3.f19917u0.setAlpha(gVar3.f19920w0);
                gVar3.invalidate();
                return;
        }
    }
}
