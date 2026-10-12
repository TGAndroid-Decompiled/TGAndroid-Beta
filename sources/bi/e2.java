package bi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class e2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f2975a;
    public final g2 f2976b;

    public e2(g2 g2Var, int i10) {
        this.f2975a = i10;
        this.f2976b = g2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2975a) {
            case 0:
                this.f2976b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                g2 g2Var = this.f2976b;
                g2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g2Var.f3071n = floatValue;
                View view = g2Var.f3068b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - g2Var.f3071n);
                view.setScaleY(1.0f - g2Var.f3071n);
                g2Var.f3069c.setColorFilter(new PorterDuffColorFilter(i0.a.d(g2Var.f3071n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                g2Var.f3067a.invalidate();
                return;
        }
    }
}
