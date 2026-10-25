package fi;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11781a;
    public final w2 f11782b;

    public v2(w2 w2Var, int i10) {
        this.f11781a = i10;
        this.f11782b = w2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11781a) {
            case 0:
                this.f11782b.f11847b.invalidate();
                return;
            default:
                this.f11782b.f11847b.invalidate();
                return;
        }
    }
}
