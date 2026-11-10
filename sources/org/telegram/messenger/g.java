package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f22537a;
    public final Object f22538b;

    public g(Object obj, int i7) {
        this.f22537a = i7;
        this.f22538b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22537a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
                ((View) this.f22538b).setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * g0.L(4.0f)));
                return;
            case 1:
                gu guVar = (gu) this.f22538b;
                guVar.getClass();
                guVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                guVar.f22743t.run();
                return;
            default:
                wu wuVar = (wu) this.f22538b;
                wuVar.getClass();
                wuVar.f26382b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = wuVar.V;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
