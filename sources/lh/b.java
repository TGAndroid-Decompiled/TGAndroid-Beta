package lh;

import android.animation.ValueAnimator;

public final class b implements ValueAnimator.AnimatorUpdateListener {

    public final int f15669a;

    public final d f15670b;

    public b(d dVar, int i10) {
        this.f15669a = i10;
        this.f15670b = dVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15669a) {
            case 0:
                d dVar = this.f15670b;
                dVar.getClass();
                dVar.L = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                break;
            case 1:
                d dVar2 = this.f15670b;
                dVar2.getClass();
                dVar2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                break;
            case 2:
                d dVar3 = this.f15670b;
                dVar3.getClass();
                dVar3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                break;
            case 3:
                d dVar4 = this.f15670b;
                dVar4.getClass();
                dVar4.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                break;
            default:
                d dVar5 = this.f15670b;
                dVar5.getClass();
                dVar5.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                break;
        }
    }
}
