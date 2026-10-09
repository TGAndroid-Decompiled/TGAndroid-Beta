package ai;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1608a;
    public final s2 f1609b;

    public q2(s2 s2Var, int i10) {
        this.f1608a = i10;
        this.f1609b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1608a) {
            case 0:
                this.f1609b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                s2 s2Var = this.f1609b;
                s2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.f1696n = floatValue;
                View view = s2Var.f1692b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - s2Var.f1696n);
                view.setScaleY(1.0f - s2Var.f1696n);
                s2Var.f1693c.setColorFilter(new PorterDuffColorFilter(i0.a.d(s2Var.f1696n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                s2Var.f1691a.invalidate();
                return;
        }
    }
}
