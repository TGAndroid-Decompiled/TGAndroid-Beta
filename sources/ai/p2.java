package ai;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class p2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f1382a;
    public final r2 f1383b;

    public p2(r2 r2Var, int i10) {
        this.f1382a = i10;
        this.f1383b = r2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f1382a) {
            case 0:
                this.f1383b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                r2 r2Var = this.f1383b;
                r2Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r2Var.f1456n = floatValue;
                View view = r2Var.f1453b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - r2Var.f1456n);
                view.setScaleY(1.0f - r2Var.f1456n);
                r2Var.f1454c.setColorFilter(new PorterDuffColorFilter(i0.a.d(r2Var.f1456n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                r2Var.f1452a.invalidate();
                return;
        }
    }
}
