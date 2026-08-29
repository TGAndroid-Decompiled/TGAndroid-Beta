package cg;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f3372a;
    public final w f3373b;
    public final v f3374c;

    public t(w wVar, v vVar, int i10) {
        this.f3372a = i10;
        this.f3373b = wVar;
        this.f3374c = vVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3372a) {
            case 0:
                w wVar = this.f3373b;
                wVar.getClass();
                this.f3374c.f3398c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.invalidate();
                return;
            default:
                w wVar2 = this.f3373b;
                wVar2.getClass();
                this.f3374c.f3398c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar2.invalidate();
                return;
        }
    }
}
