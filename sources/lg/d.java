package lg;

import android.animation.ValueAnimator;
public final class d implements ValueAnimator.AnimatorUpdateListener {
    public final int f18264a;
    public final g f18265b;

    public d(g gVar, int i7) {
        this.f18264a = i7;
        this.f18265b = gVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18264a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar = this.f18265b;
                gVar.f18309j0 = floatValue;
                gVar.H = true;
                gVar.invalidate();
                return;
            case 1:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar2 = this.f18265b;
                gVar2.f18311k0 = floatValue2;
                gVar2.H = true;
                gVar2.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g gVar3 = this.f18265b;
                gVar3.f18324v0 = floatValue3;
                gVar3.f18322t0.setAlpha(gVar3.f18324v0);
                gVar3.invalidate();
                return;
        }
    }
}
