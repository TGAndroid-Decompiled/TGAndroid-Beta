package mg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f19303a;
    public final g f19304b;

    public d(g gVar, int i3) {
        this.f19303a = i3;
        this.f19304b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19303a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f19304b;
                gVar.f19350k0 = floatValue;
                gVar.I = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f19304b;
                gVar2.f19351l0 = floatValue2;
                gVar2.I = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f19304b;
                gVar3.f19365w0 = floatValue3;
                gVar3.f19362u0.setAlpha(gVar3.f19365w0);
                gVar3.invalidate();
                return;
        }
    }
}
