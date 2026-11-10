package di;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class l1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9309a;
    public final n1 f9310b;

    public l1(n1 n1Var, int i7) {
        this.f9309a = i7;
        this.f9310b = n1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9309a) {
            case 0:
                this.f9310b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                n1 n1Var = this.f9310b;
                n1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.f9388n = floatValue;
                View view = n1Var.f9384b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - n1Var.f9388n);
                view.setScaleY(1.0f - n1Var.f9388n);
                n1Var.f9385c.setColorFilter(new PorterDuffColorFilter(i0.a.f(n1Var.f9388n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                n1Var.f9383a.invalidate();
                return;
        }
    }
}
