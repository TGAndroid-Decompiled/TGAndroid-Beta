package ei;

import android.animation.ValueAnimator;
public final class wa implements ValueAnimator.AnimatorUpdateListener {
    public final int f10071a;
    public final vb f10072b;

    public wa(vb vbVar, int i10) {
        this.f10071a = i10;
        this.f10072b = vbVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10071a) {
            case 0:
                this.f10072b.f9973c1.m();
                return;
            default:
                this.f10072b.m0();
                return;
        }
    }
}
