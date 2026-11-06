package lg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f18261a;
    public final g f18262b;

    public d(g gVar, int i7) {
        this.f18261a = i7;
        this.f18262b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18261a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f18262b;
                gVar.f18306j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f18262b;
                gVar2.f18308k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f18262b;
                gVar3.f18321v0 = floatValue3;
                gVar3.f18319t0.setAlpha(gVar3.f18321v0);
                gVar3.invalidate();
                return;
        }
    }
}
