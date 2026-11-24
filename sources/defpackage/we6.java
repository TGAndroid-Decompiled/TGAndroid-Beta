package defpackage;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;
public final class we6 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final af6 b;

    public we6(af6 af6Var, byte b) {
        this.a = b;
        this.b = af6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        af6 af6Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                af6Var.d.setAlpha(floatValue);
                af6Var.e.setAlpha(floatValue);
                af6Var.f.setProgress(floatValue);
                FrameLayout frameLayout = af6Var.x;
                frameLayout.setAlpha(floatValue);
                float f = (floatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f);
                frameLayout.setScaleY(f);
                return;
            default:
                af6Var.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                af6Var.f.setProgress(floatValue2);
                af6Var.d.setAlpha(floatValue2);
                af6Var.e.setAlpha(floatValue2);
                FrameLayout frameLayout2 = af6Var.x;
                frameLayout2.setAlpha(floatValue2);
                float f2 = (floatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f2);
                frameLayout2.setScaleY(f2);
                return;
        }
    }
}
