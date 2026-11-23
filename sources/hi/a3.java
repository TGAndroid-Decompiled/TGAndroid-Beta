package hi;

import android.animation.ValueAnimator;
public final class a3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14181a;
    public final b3 f14182b;

    public a3(b3 b3Var, int i7) {
        this.f14181a = i7;
        this.f14182b = b3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14181a) {
            case 0:
                ((m3) this.f14182b.f14223c).invalidate();
                return;
            default:
                ((m3) this.f14182b.f14223c).invalidate();
                return;
        }
    }
}
