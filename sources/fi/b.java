package fi;

import android.animation.ValueAnimator;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f11634a;
    public final d f11635b;

    public b(d dVar, int i7) {
        this.f11634a = i7;
        this.f11635b = dVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11634a) {
            case 0:
                d dVar = this.f11635b;
                dVar.getClass();
                dVar.S = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                dVar.invalidate();
                return;
            case 1:
                d dVar2 = this.f11635b;
                dVar2.getClass();
                dVar2.f11754b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar2.invalidate();
                return;
            case 2:
                d dVar3 = this.f11635b;
                dVar3.getClass();
                dVar3.P = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar3.invalidate();
                return;
            case 3:
                d dVar4 = this.f11635b;
                dVar4.getClass();
                dVar4.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar4.invalidate();
                return;
            default:
                d dVar5 = this.f11635b;
                dVar5.getClass();
                dVar5.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dVar5.invalidate();
                return;
        }
    }
}
