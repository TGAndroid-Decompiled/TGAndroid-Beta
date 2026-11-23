package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12035a;
    public final j1 f12036b;

    public h1(j1 j1Var, int i7) {
        this.f12035a = i7;
        this.f12036b = j1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12035a) {
            case 0:
                this.f12036b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                j1 j1Var = this.f12036b;
                j1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1Var.f12138n = floatValue;
                View view = j1Var.f12134b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - j1Var.f12138n);
                view.setScaleY(1.0f - j1Var.f12138n);
                j1Var.f12135c.setColorFilter(new PorterDuffColorFilter(i0.a.f(j1Var.f12138n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                j1Var.f12133a.invalidate();
                return;
        }
    }
}
