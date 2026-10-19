package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class s1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5953a;
    public final u1 f5954b;

    public s1(u1 u1Var, int i10) {
        this.f5953a = i10;
        this.f5954b = u1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5953a) {
            case 0:
                this.f5954b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                u1 u1Var = this.f5954b;
                u1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u1Var.f6040n = floatValue;
                View view = u1Var.f6037b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - u1Var.f6040n);
                view.setScaleY(1.0f - u1Var.f6040n);
                u1Var.f6038c.setColorFilter(new PorterDuffColorFilter(i0.a.f(u1Var.f6040n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                u1Var.f6036a.invalidate();
                return;
        }
    }
}
