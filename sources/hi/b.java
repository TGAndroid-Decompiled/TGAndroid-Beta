package hi;

import android.animation.ValueAnimator;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f14203a;
    public final d f14204b;

    public b(d dVar, int i7) {
        this.f14203a = i7;
        this.f14204b = dVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14203a) {
            case 0:
                d dVar = this.f14204b;
                dVar.getClass();
                dVar.U = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                return;
            case 1:
                d dVar2 = this.f14204b;
                dVar2.getClass();
                dVar2.f14301d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                return;
            case 2:
                d dVar3 = this.f14204b;
                dVar3.getClass();
                dVar3.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                return;
            case 3:
                d dVar4 = this.f14204b;
                dVar4.getClass();
                dVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                return;
            default:
                d dVar5 = this.f14204b;
                dVar5.getClass();
                dVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                return;
        }
    }
}
