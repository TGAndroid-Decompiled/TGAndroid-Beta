package fi;

import android.animation.ValueAnimator;
public final class v2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11780a;
    public final w2 f11781b;

    public v2(w2 w2Var, int i10) {
        this.f11780a = i10;
        this.f11781b = w2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11780a) {
            case 0:
                this.f11781b.f11846b.invalidate();
                return;
            default:
                this.f11781b.f11846b.invalidate();
                return;
        }
    }
}
