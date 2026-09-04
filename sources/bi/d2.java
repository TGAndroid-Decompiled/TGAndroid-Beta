package bi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f2852a;
    public final f2 f2853b;

    public d2(f2 f2Var, int i10) {
        this.f2852a = i10;
        this.f2853b = f2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2852a) {
            case 0:
                this.f2853b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                f2 f2Var = this.f2853b;
                f2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var.f2957n = floatValue;
                View view = f2Var.f2953b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - f2Var.f2957n);
                view.setScaleY(1.0f - f2Var.f2957n);
                f2Var.f2954c.setColorFilter(new PorterDuffColorFilter(i0.a.d(f2Var.f2957n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                f2Var.f2952a.invalidate();
                return;
        }
    }
}
