package ai;

import android.animation.ValueAnimator;
public final class ub implements ValueAnimator.AnimatorUpdateListener {
    public final int f1592a;
    public final xb f1593b;

    public ub(xb xbVar, int i10) {
        this.f1592a = i10;
        this.f1593b = xbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1592a) {
            case 0:
                jc jcVar = this.f1593b.I0;
                jcVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc.k(jcVar);
                return;
            default:
                jc jcVar2 = this.f1593b.I0;
                jcVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc.k(jcVar2);
                return;
        }
    }
}
