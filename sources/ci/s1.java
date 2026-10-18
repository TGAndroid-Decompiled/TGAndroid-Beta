package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class s1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5954a;
    public final u1 f5955b;

    public s1(u1 u1Var, int i10) {
        this.f5954a = i10;
        this.f5955b = u1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5954a) {
            case 0:
                this.f5955b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                u1 u1Var = this.f5955b;
                u1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.f6041n = floatValue;
                View view = u1Var.f6038b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - u1Var.f6041n);
                view.setScaleY(1.0f - u1Var.f6041n);
                u1Var.f6039c.setColorFilter(new PorterDuffColorFilter(i0.a.f(u1Var.f6041n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                u1Var.f6037a.invalidate();
                return;
        }
    }
}
