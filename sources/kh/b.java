package kh;

import android.animation.ValueAnimator;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f14972a;
    public final d f14973b;

    public b(d dVar, int i9) {
        this.f14972a = i9;
        this.f14973b = dVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14972a) {
            case 0:
                d dVar = this.f14973b;
                dVar.getClass();
                dVar.L = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                return;
            case 1:
                d dVar2 = this.f14973b;
                dVar2.getClass();
                dVar2.R = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                return;
            case 2:
                d dVar3 = this.f14973b;
                dVar3.getClass();
                dVar3.I = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                return;
            case 3:
                d dVar4 = this.f14973b;
                dVar4.getClass();
                dVar4.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                return;
            default:
                d dVar5 = this.f14973b;
                dVar5.getClass();
                dVar5.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                return;
        }
    }
}
