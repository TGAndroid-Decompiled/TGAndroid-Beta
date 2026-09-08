package bi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f2879a;
    public final f2 f2880b;

    public d2(f2 f2Var, int i10) {
        this.f2879a = i10;
        this.f2880b = f2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2879a) {
            case 0:
                this.f2880b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                f2 f2Var = this.f2880b;
                f2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f2Var.f2984n = floatValue;
                View view = f2Var.f2980b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - f2Var.f2984n);
                view.setScaleY(1.0f - f2Var.f2984n);
                f2Var.f2981c.setColorFilter(new PorterDuffColorFilter(i0.a.d(f2Var.f2984n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                f2Var.f2979a.invalidate();
                return;
        }
    }
}
