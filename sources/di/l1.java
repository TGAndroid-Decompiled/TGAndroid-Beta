package di;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class l1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9304a;
    public final n1 f9305b;

    public l1(n1 n1Var, int i7) {
        this.f9304a = i7;
        this.f9305b = n1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9304a) {
            case 0:
                this.f9305b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                n1 n1Var = this.f9305b;
                n1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n1Var.f9383n = floatValue;
                View view = n1Var.f9379b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - n1Var.f9383n);
                view.setScaleY(1.0f - n1Var.f9383n);
                n1Var.f9380c.setColorFilter(new PorterDuffColorFilter(i0.a.f(n1Var.f9383n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                n1Var.f9378a.invalidate();
                return;
        }
    }
}
