package gi;

import android.animation.ValueAnimator;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f12422a;
    public final d f12423b;

    public b(d dVar, int i3) {
        this.f12422a = i3;
        this.f12423b = dVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12422a) {
            case 0:
                d dVar = this.f12423b;
                dVar.getClass();
                dVar.T = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                return;
            case 1:
                d dVar2 = this.f12423b;
                dVar2.getClass();
                dVar2.f12516c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                return;
            case 2:
                d dVar3 = this.f12423b;
                dVar3.getClass();
                dVar3.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                return;
            case 3:
                d dVar4 = this.f12423b;
                dVar4.getClass();
                dVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                return;
            default:
                d dVar5 = this.f12423b;
                dVar5.getClass();
                dVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                return;
        }
    }
}
