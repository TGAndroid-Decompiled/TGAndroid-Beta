package bi;

import android.animation.ValueAnimator;
public final class db implements ValueAnimator.AnimatorUpdateListener {
    public final int f2966a;
    public final gb f2967b;

    public db(gb gbVar, int i10) {
        this.f2966a = i10;
        this.f2967b = gbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2966a) {
            case 0:
                sb sbVar = this.f2967b.I0;
                sbVar.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb.k(sbVar);
                return;
            default:
                sb sbVar2 = this.f2967b.I0;
                sbVar2.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb.k(sbVar2);
                return;
        }
    }
}
