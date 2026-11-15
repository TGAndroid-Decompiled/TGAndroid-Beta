package hi;

import android.animation.ValueAnimator;
public final class t9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15158a;
    public final sa f15159b;

    public t9(sa saVar, int i7) {
        this.f15158a = i7;
        this.f15159b = saVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15158a) {
            case 0:
                this.f15159b.f15048d1.m();
                return;
            default:
                this.f15159b.m0();
                return;
        }
    }
}
