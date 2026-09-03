package oh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class m1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f17426a;
    public final o1 f17427b;

    public m1(o1 o1Var, int i10) {
        this.f17426a = i10;
        this.f17427b = o1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17426a) {
            case 0:
                this.f17427b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o1 o1Var = this.f17427b;
                o1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.f17545n = floatValue;
                View view = o1Var.f17541b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - o1Var.f17545n);
                view.setScaleY(1.0f - o1Var.f17545n);
                o1Var.f17542c.setColorFilter(new PorterDuffColorFilter(i0.a.d(o1Var.f17545n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                o1Var.f17540a.invalidate();
                return;
        }
    }
}
