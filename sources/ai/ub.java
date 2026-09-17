package ai;

import android.animation.ValueAnimator;
public final class ub implements ValueAnimator.AnimatorUpdateListener {
    public final int f1595a;
    public final xb f1596b;

    public ub(xb xbVar, int i10) {
        this.f1595a = i10;
        this.f1596b = xbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1595a) {
            case 0:
                jc jcVar = this.f1596b.I0;
                jcVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc.k(jcVar);
                return;
            default:
                jc jcVar2 = this.f1596b.I0;
                jcVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jc.k(jcVar2);
                return;
        }
    }
}
