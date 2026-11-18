package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f24091a;
    public final Object f24092b;

    public g(Object obj, int i7) {
        this.f24091a = i7;
        this.f24092b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24091a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
                ((View) this.f24092b).setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * g0.L(4.0f)));
                return;
            case 1:
                au auVar = (au) this.f24092b;
                auVar.getClass();
                auVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                auVar.f22966t.run();
                return;
            default:
                qu quVar = (qu) this.f24092b;
                quVar.getClass();
                quVar.f26458c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = quVar.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
