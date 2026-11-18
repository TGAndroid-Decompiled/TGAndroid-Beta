package fi;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12032a;
    public final j1 f12033b;

    public h1(j1 j1Var, int i7) {
        this.f12032a = i7;
        this.f12033b = j1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12032a) {
            case 0:
                this.f12033b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                j1 j1Var = this.f12033b;
                j1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j1Var.f12144n = floatValue;
                View view = j1Var.f12140b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - j1Var.f12144n);
                view.setScaleY(1.0f - j1Var.f12144n);
                j1Var.f12141c.setColorFilter(new PorterDuffColorFilter(i0.a.f(j1Var.f12144n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                j1Var.f12139a.invalidate();
                return;
        }
    }
}
