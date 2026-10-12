package di;

import android.animation.ValueAnimator;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f6643a;
    public final d f6644b;

    public b(d dVar, int i10) {
        this.f6643a = i10;
        this.f6644b = dVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6643a) {
            case 0:
                d dVar = this.f6644b;
                dVar.getClass();
                dVar.P = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                return;
            case 1:
                d dVar2 = this.f6644b;
                dVar2.getClass();
                dVar2.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                return;
            case 2:
                d dVar3 = this.f6644b;
                dVar3.getClass();
                dVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                return;
            case 3:
                d dVar4 = this.f6644b;
                dVar4.getClass();
                dVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                return;
            default:
                d dVar5 = this.f6644b;
                dVar5.getClass();
                dVar5.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                return;
        }
    }
}
