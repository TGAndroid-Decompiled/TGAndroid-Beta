package bi;

import android.animation.ValueAnimator;
public final class hb implements ValueAnimator.AnimatorUpdateListener {
    public final int f2804a;
    public final ib f2805b;

    public hb(ib ibVar, int i10) {
        this.f2804a = i10;
        this.f2805b = ibVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2804a) {
            case 0:
                ib.a(this.f2805b, valueAnimator);
                return;
            default:
                ib ibVar = this.f2805b;
                ibVar.getClass();
                ibVar.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
