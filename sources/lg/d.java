package lg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f19758a;
    public final g f19759b;

    public d(g gVar, int i7) {
        this.f19758a = i7;
        this.f19759b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19758a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f19759b;
                gVar.f19804k0 = floatValue;
                gVar.I = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f19759b;
                gVar2.f19806l0 = floatValue2;
                gVar2.I = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f19759b;
                gVar3.f19820w0 = floatValue3;
                gVar3.f19817u0.setAlpha(gVar3.f19820w0);
                gVar3.invalidate();
                return;
        }
    }
}
