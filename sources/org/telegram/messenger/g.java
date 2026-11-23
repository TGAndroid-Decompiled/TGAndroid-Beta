package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f23980a;
    public final Object f23981b;

    public g(Object obj, int i7) {
        this.f23980a = i7;
        this.f23981b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23980a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
                ((View) this.f23981b).setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * g0.L(4.0f)));
                return;
            case 1:
                bu buVar = (bu) this.f23981b;
                buVar.getClass();
                buVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                buVar.f23142t.run();
                return;
            default:
                ru ruVar = (ru) this.f23981b;
                ruVar.getClass();
                ruVar.f26631c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ruVar.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
