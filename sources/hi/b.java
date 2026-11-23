package hi;

import android.animation.ValueAnimator;
public final class b implements ValueAnimator.AnimatorUpdateListener {
    public final int f14280a;
    public final e f14281b;

    public b(e eVar, int i7) {
        this.f14280a = i7;
        this.f14281b = eVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14280a) {
            case 0:
                e eVar = this.f14281b;
                eVar.getClass();
                eVar.U = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                eVar.invalidate();
                return;
            case 1:
                e eVar2 = this.f14281b;
                eVar2.getClass();
                eVar2.f14565d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar2.invalidate();
                return;
            case 2:
                e eVar3 = this.f14281b;
                eVar3.getClass();
                eVar3.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar3.invalidate();
                return;
            case 3:
                e eVar4 = this.f14281b;
                eVar4.getClass();
                eVar4.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar4.invalidate();
                return;
            default:
                e eVar5 = this.f14281b;
                eVar5.getClass();
                eVar5.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eVar5.invalidate();
                return;
        }
    }
}
