package fi;

import android.animation.ValueAnimator;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f11629a;
    public final d f11630b;

    public b(d dVar, int i7) {
        this.f11629a = i7;
        this.f11630b = dVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11629a) {
            case 0:
                d dVar = this.f11630b;
                dVar.getClass();
                dVar.S = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                return;
            case 1:
                d dVar2 = this.f11630b;
                dVar2.getClass();
                dVar2.f11750b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                return;
            case 2:
                d dVar3 = this.f11630b;
                dVar3.getClass();
                dVar3.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                return;
            case 3:
                d dVar4 = this.f11630b;
                dVar4.getClass();
                dVar4.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                return;
            default:
                d dVar5 = this.f11630b;
                dVar5.getClass();
                dVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                return;
        }
    }
}
