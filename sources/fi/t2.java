package fi;

import android.animation.ValueAnimator;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12846a;
    public final u2 f12847b;

    public t2(u2 u2Var, int i7) {
        this.f12846a = i7;
        this.f12847b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12846a) {
            case 0:
                ((f3) this.f12847b.f12884c).invalidate();
                return;
            default:
                ((f3) this.f12847b.f12884c).invalidate();
                return;
        }
    }
}
