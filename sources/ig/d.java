package ig;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f11095a;
    public final g f11096b;

    public d(g gVar, int i10) {
        this.f11095a = i10;
        this.f11096b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11095a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f11096b;
                gVar.f11139j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f11096b;
                gVar2.f11141k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f11096b;
                gVar3.f11154v0 = floatValue3;
                gVar3.f11152t0.setAlpha(gVar3.f11154v0);
                gVar3.invalidate();
                return;
        }
    }
}
