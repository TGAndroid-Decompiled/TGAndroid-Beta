package ei;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10799a;
    public final s1 f10800b;

    public q1(s1 s1Var, int i3) {
        this.f10799a = i3;
        this.f10800b = s1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10799a) {
            case 0:
                this.f10800b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                s1 s1Var = this.f10800b;
                s1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                s1Var.f10982n = floatValue;
                View view = s1Var.f10978b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - s1Var.f10982n);
                view.setScaleY(1.0f - s1Var.f10982n);
                s1Var.f10979c.setColorFilter(new PorterDuffColorFilter(i0.a.f(s1Var.f10982n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                s1Var.f10977a.invalidate();
                return;
        }
    }
}
