package eg;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f5506a;
    public final w f5507b;
    public final v f5508c;

    public t(w wVar, v vVar, int i10) {
        this.f5506a = i10;
        this.f5507b = wVar;
        this.f5508c = vVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5506a) {
            case 0:
                w wVar = this.f5507b;
                wVar.getClass();
                this.f5508c.f5532c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.invalidate();
                return;
            default:
                w wVar2 = this.f5507b;
                wVar2.getClass();
                this.f5508c.f5532c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar2.invalidate();
                return;
        }
    }
}
