package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class j1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11891a;
    public final l1 f11892b;

    public j1(l1 l1Var, int i7) {
        this.f11891a = i7;
        this.f11892b = l1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11891a) {
            case 0:
                this.f11892b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                l1 l1Var = this.f11892b;
                l1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l1Var.f11983n = floatValue;
                View view = l1Var.f11979b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - l1Var.f11983n);
                view.setScaleY(1.0f - l1Var.f11983n);
                l1Var.f11980c.setColorFilter(new PorterDuffColorFilter(i0.a.f(l1Var.f11983n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                l1Var.f11978a.invalidate();
                return;
        }
    }
}
