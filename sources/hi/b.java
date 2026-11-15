package hi;

import android.animation.ValueAnimator;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f13912a;
    public final d f13913b;

    public b(d dVar, int i7) {
        this.f13912a = i7;
        this.f13913b = dVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13912a) {
            case 0:
                d dVar = this.f13913b;
                dVar.getClass();
                dVar.T = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                return;
            case 1:
                d dVar2 = this.f13913b;
                dVar2.getClass();
                dVar2.f14055c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                return;
            case 2:
                d dVar3 = this.f13913b;
                dVar3.getClass();
                dVar3.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                return;
            case 3:
                d dVar4 = this.f13913b;
                dVar4.getClass();
                dVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                return;
            default:
                d dVar5 = this.f13913b;
                dVar5.getClass();
                dVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                return;
        }
    }
}
