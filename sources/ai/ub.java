package ai;

import android.animation.ValueAnimator;
public final class ub implements ValueAnimator.AnimatorUpdateListener {
    public final int f1590a;
    public final xb f1591b;

    public ub(xb xbVar, int i10) {
        this.f1590a = i10;
        this.f1591b = xbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1590a) {
            case 0:
                jc jcVar = this.f1591b.I0;
                jcVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc.k(jcVar);
                return;
            default:
                jc jcVar2 = this.f1591b.I0;
                jcVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc.k(jcVar2);
                return;
        }
    }
}
