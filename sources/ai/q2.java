package ai;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class q2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1606a;
    public final s2 f1607b;

    public q2(s2 s2Var, int i10) {
        this.f1606a = i10;
        this.f1607b = s2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1606a) {
            case 0:
                this.f1607b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                s2 s2Var = this.f1607b;
                s2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s2Var.f1694n = floatValue;
                View view = s2Var.f1690b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - s2Var.f1694n);
                view.setScaleY(1.0f - s2Var.f1694n);
                s2Var.f1691c.setColorFilter(new PorterDuffColorFilter(i0.a.d(s2Var.f1694n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                s2Var.f1689a.invalidate();
                return;
        }
    }
}
