package fi;

import android.animation.ValueAnimator;
public final class t2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12845a;
    public final u2 f12846b;

    public t2(u2 u2Var, int i7) {
        this.f12845a = i7;
        this.f12846b = u2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12845a) {
            case 0:
                ((f3) this.f12846b.f12885c).invalidate();
                return;
            default:
                ((f3) this.f12846b.f12885c).invalidate();
                return;
        }
    }
}
