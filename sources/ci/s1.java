package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class s1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5951a;
    public final u1 f5952b;

    public s1(u1 u1Var, int i10) {
        this.f5951a = i10;
        this.f5952b = u1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5951a) {
            case 0:
                this.f5952b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                u1 u1Var = this.f5952b;
                u1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.f6038n = floatValue;
                View view = u1Var.f6035b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - u1Var.f6038n);
                view.setScaleY(1.0f - u1Var.f6038n);
                u1Var.f6036c.setColorFilter(new PorterDuffColorFilter(i0.a.f(u1Var.f6038n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                u1Var.f6034a.invalidate();
                return;
        }
    }
}
