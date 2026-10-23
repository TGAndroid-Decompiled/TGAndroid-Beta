package ei;

import android.animation.ValueAnimator;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f8771a;
    public final d f8772b;

    public b(d dVar, int i10) {
        this.f8771a = i10;
        this.f8772b = dVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8771a) {
            case 0:
                d dVar = this.f8772b;
                dVar.getClass();
                dVar.S = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                return;
            case 1:
                d dVar2 = this.f8772b;
                dVar2.getClass();
                dVar2.f8860b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                return;
            case 2:
                d dVar3 = this.f8772b;
                dVar3.getClass();
                dVar3.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                return;
            case 3:
                d dVar4 = this.f8772b;
                dVar4.getClass();
                dVar4.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                return;
            default:
                d dVar5 = this.f8772b;
                dVar5.getClass();
                dVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                return;
        }
    }
}
