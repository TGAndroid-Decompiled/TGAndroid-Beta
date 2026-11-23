package lg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f19792a;
    public final g f19793b;

    public d(g gVar, int i7) {
        this.f19792a = i7;
        this.f19793b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19792a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f19793b;
                gVar.f19838k0 = floatValue;
                gVar.I = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f19793b;
                gVar2.f19840l0 = floatValue2;
                gVar2.I = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f19793b;
                gVar3.f19854w0 = floatValue3;
                gVar3.f19851u0.setAlpha(gVar3.f19854w0);
                gVar3.invalidate();
                return;
        }
    }
}
