package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class xg6 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final bh6 b;

    public xg6(bh6 bh6Var, byte b) {
        this.a = b;
        this.b = bh6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        bh6 bh6Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh6Var.d.setAlpha(floatValue);
                bh6Var.e.setAlpha(floatValue);
                bh6Var.f.setProgress(floatValue);
                FrameLayout frameLayout = bh6Var.x;
                frameLayout.setAlpha(floatValue);
                float f = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f);
                frameLayout.setScaleY(f);
                return;
            default:
                bh6Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bh6Var.f.setProgress(floatValue2);
                bh6Var.d.setAlpha(floatValue2);
                bh6Var.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = bh6Var.x;
                frameLayout2.setAlpha(floatValue2);
                float f2 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f2);
                frameLayout2.setScaleY(f2);
                return;
        }
    }
}
