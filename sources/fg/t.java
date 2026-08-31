package fg;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f6551a;
    public final w f6552b;
    public final v f6553c;

    public t(w wVar, v vVar, int i10) {
        this.f6551a = i10;
        this.f6552b = wVar;
        this.f6553c = vVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6551a) {
            case 0:
                w wVar = this.f6552b;
                wVar.getClass();
                this.f6553c.f6578c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.invalidate();
                return;
            default:
                w wVar2 = this.f6552b;
                wVar2.getClass();
                this.f6553c.f6578c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar2.invalidate();
                return;
        }
    }
}
