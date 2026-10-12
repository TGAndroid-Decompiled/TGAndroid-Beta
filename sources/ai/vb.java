package ai;

import android.animation.ValueAnimator;
public final class vb implements ValueAnimator.AnimatorUpdateListener {
    public final int f1837a;
    public final yb f1838b;

    public vb(yb ybVar, int i10) {
        this.f1837a = i10;
        this.f1838b = ybVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1837a) {
            case 0:
                kc kcVar = this.f1838b.I0;
                kcVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc.k(kcVar);
                return;
            default:
                kc kcVar2 = this.f1838b.I0;
                kcVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kc.k(kcVar2);
                return;
        }
    }
}
