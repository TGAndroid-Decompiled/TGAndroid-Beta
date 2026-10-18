package ci;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class r1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5846a;
    public final t1 f5847b;

    public r1(t1 t1Var, int i10) {
        this.f5846a = i10;
        this.f5847b = t1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5846a) {
            case 0:
                this.f5847b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                t1 t1Var = this.f5847b;
                t1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t1Var.f5939n = floatValue;
                View view = t1Var.f5936b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - t1Var.f5939n);
                view.setScaleY(1.0f - t1Var.f5939n);
                t1Var.f5937c.setColorFilter(new PorterDuffColorFilter(i0.a.f(t1Var.f5939n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                t1Var.f5935a.invalidate();
                return;
        }
    }
}
