package bi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f2979a;
    public final g2 f2980b;

    public e2(g2 g2Var, int i10) {
        this.f2979a = i10;
        this.f2980b = g2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2979a) {
            case 0:
                this.f2980b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                g2 g2Var = this.f2980b;
                g2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var.f3075n = floatValue;
                View view = g2Var.f3072b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - g2Var.f3075n);
                view.setScaleY(1.0f - g2Var.f3075n);
                g2Var.f3073c.setColorFilter(new PorterDuffColorFilter(i0.a.d(g2Var.f3075n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                g2Var.f3071a.invalidate();
                return;
        }
    }
}
