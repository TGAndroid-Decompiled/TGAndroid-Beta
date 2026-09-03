package eg;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f5495a;
    public final w f5496b;
    public final v f5497c;

    public t(w wVar, v vVar, int i10) {
        this.f5495a = i10;
        this.f5496b = wVar;
        this.f5497c = vVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5495a) {
            case 0:
                w wVar = this.f5496b;
                wVar.getClass();
                this.f5497c.f5521c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar.invalidate();
                return;
            default:
                w wVar2 = this.f5496b;
                wVar2.getClass();
                this.f5497c.f5521c = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wVar2.invalidate();
                return;
        }
    }
}
