package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class r1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5850a;
    public final t1 f5851b;

    public r1(t1 t1Var, int i10) {
        this.f5850a = i10;
        this.f5851b = t1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5850a) {
            case 0:
                this.f5851b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                t1 t1Var = this.f5851b;
                t1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.f5944n = floatValue;
                View view = t1Var.f5941b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - t1Var.f5944n);
                view.setScaleY(1.0f - t1Var.f5944n);
                t1Var.f5942c.setColorFilter(new PorterDuffColorFilter(i0.a.f(t1Var.f5944n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                t1Var.f5940a.invalidate();
                return;
        }
    }
}
