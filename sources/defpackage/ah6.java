package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class ah6 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final eh6 b;

    public ah6(eh6 eh6Var, byte b) {
        this.a = b;
        this.b = eh6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        eh6 eh6Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh6Var.d.setAlpha(floatValue);
                eh6Var.e.setAlpha(floatValue);
                eh6Var.f.setProgress(floatValue);
                FrameLayout frameLayout = eh6Var.x;
                frameLayout.setAlpha(floatValue);
                float f = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f);
                frameLayout.setScaleY(f);
                return;
            default:
                eh6Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eh6Var.f.setProgress(floatValue2);
                eh6Var.d.setAlpha(floatValue2);
                eh6Var.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = eh6Var.x;
                frameLayout2.setAlpha(floatValue2);
                float f2 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f2);
                frameLayout2.setScaleY(f2);
                return;
        }
    }
}
