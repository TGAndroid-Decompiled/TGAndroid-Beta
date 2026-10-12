package ig;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f12131a;
    public final g f12132b;

    public d(g gVar, int i10) {
        this.f12131a = i10;
        this.f12132b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12131a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f12132b;
                gVar.f12177j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f12132b;
                gVar2.f12179k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f12132b;
                gVar3.f12192v0 = floatValue3;
                gVar3.f12190t0.setAlpha(gVar3.f12192v0);
                gVar3.invalidate();
                return;
        }
    }
}
