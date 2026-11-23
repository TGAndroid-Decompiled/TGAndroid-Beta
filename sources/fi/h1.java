package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12073a;
    public final j1 f12074b;

    public h1(j1 j1Var, int i7) {
        this.f12073a = i7;
        this.f12074b = j1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12073a) {
            case 0:
                this.f12074b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                j1 j1Var = this.f12074b;
                j1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1Var.f12176n = floatValue;
                View view = j1Var.f12172b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - j1Var.f12176n);
                view.setScaleY(1.0f - j1Var.f12176n);
                j1Var.f12173c.setColorFilter(new PorterDuffColorFilter(i0.a.f(j1Var.f12176n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                j1Var.f12171a.invalidate();
                return;
        }
    }
}
