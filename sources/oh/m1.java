package oh;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
public final class m1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f17424a;
    public final o1 f17425b;

    public m1(o1 o1Var, int i10) {
        this.f17424a = i10;
        this.f17425b = o1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f17424a) {
            case 0:
                this.f17425b.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o1 o1Var = this.f17425b;
                o1Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o1Var.f17543n = floatValue;
                View view = o1Var.f17539b;
                view.setAlpha(1.0f - floatValue);
                view.setScaleX(1.0f - o1Var.f17543n);
                view.setScaleY(1.0f - o1Var.f17543n);
                o1Var.f17540c.setColorFilter(new PorterDuffColorFilter(i0.a.d(o1Var.f17543n, -1, -2960428), PorterDuff.Mode.SRC_IN));
                o1Var.f17538a.invalidate();
                return;
        }
    }
}
