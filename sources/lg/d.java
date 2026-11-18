package lg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f19761a;
    public final g f19762b;

    public d(g gVar, int i7) {
        this.f19761a = i7;
        this.f19762b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19761a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f19762b;
                gVar.f19807k0 = floatValue;
                gVar.I = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f19762b;
                gVar2.f19809l0 = floatValue2;
                gVar2.I = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f19762b;
                gVar3.f19823w0 = floatValue3;
                gVar3.f19820u0.setAlpha(gVar3.f19823w0);
                gVar3.invalidate();
                return;
        }
    }
}
