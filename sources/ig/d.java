package ig;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f12085a;
    public final g f12086b;

    public d(g gVar, int i10) {
        this.f12085a = i10;
        this.f12086b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12085a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f12086b;
                gVar.f12131j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f12086b;
                gVar2.f12133k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f12086b;
                gVar3.f12146v0 = floatValue3;
                gVar3.f12144t0.setAlpha(gVar3.f12146v0);
                gVar3.invalidate();
                return;
        }
    }
}
