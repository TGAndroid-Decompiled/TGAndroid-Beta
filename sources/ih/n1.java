package ih;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class n1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11839a;
    public final p1 f11840b;

    public n1(p1 p1Var, int i9) {
        this.f11839a = i9;
        this.f11840b = p1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11839a) {
            case 0:
                this.f11840b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                p1 p1Var = this.f11840b;
                p1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p1Var.f11937n = floatValue;
                View view = p1Var.f11933b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - p1Var.f11937n);
                view.setScaleY(1.0f - p1Var.f11937n);
                p1Var.f11934c.setColorFilter(new PorterDuffColorFilter(i0.a.d(p1Var.f11937n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                p1Var.f11932a.invalidate();
                return;
        }
    }
}
