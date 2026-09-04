package di;

import android.animation.ValueAnimator;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f6928a;
    public final d f6929b;

    public b(d dVar, int i10) {
        this.f6928a = i10;
        this.f6929b = dVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6928a) {
            case 0:
                d dVar = this.f6929b;
                dVar.getClass();
                dVar.P = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                return;
            case 1:
                d dVar2 = this.f6929b;
                dVar2.getClass();
                dVar2.V = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                return;
            case 2:
                d dVar3 = this.f6929b;
                dVar3.getClass();
                dVar3.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                return;
            case 3:
                d dVar4 = this.f6929b;
                dVar4.getClass();
                dVar4.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                return;
            default:
                d dVar5 = this.f6929b;
                dVar5.getClass();
                dVar5.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                return;
        }
    }
}
