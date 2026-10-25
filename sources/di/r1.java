package di;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class r1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9110a;
    public final t1 f9111b;

    public r1(t1 t1Var, int i10) {
        this.f9110a = i10;
        this.f9111b = t1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9110a) {
            case 0:
                this.f9111b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                t1 t1Var = this.f9111b;
                t1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.f9182n = floatValue;
                View view = t1Var.f9179b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - t1Var.f9182n);
                view.setScaleY(1.0f - t1Var.f9182n);
                t1Var.f9180c.setColorFilter(new PorterDuffColorFilter(i0.a.f(t1Var.f9182n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                t1Var.f9178a.invalidate();
                return;
        }
    }
}
