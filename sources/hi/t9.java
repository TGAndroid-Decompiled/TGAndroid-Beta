package hi;

import android.animation.ValueAnimator;
public final class t9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15515a;
    public final sa f15516b;

    public t9(sa saVar, int i7) {
        this.f15515a = i7;
        this.f15516b = saVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15515a) {
            case 0:
                this.f15516b.f15394d1.m();
                return;
            default:
                this.f15516b.m0();
                return;
        }
    }
}
