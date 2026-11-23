package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12024a;
    public final j1 f12025b;

    public h1(j1 j1Var, int i7) {
        this.f12024a = i7;
        this.f12025b = j1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12024a) {
            case 0:
                this.f12025b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                j1 j1Var = this.f12025b;
                j1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1Var.f12136n = floatValue;
                View view = j1Var.f12132b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - j1Var.f12136n);
                view.setScaleY(1.0f - j1Var.f12136n);
                j1Var.f12133c.setColorFilter(new PorterDuffColorFilter(i0.a.f(j1Var.f12136n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                j1Var.f12131a.invalidate();
                return;
        }
    }
}
