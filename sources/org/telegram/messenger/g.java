package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f24088a;
    public final Object f24089b;

    public g(Object obj, int i7) {
        this.f24088a = i7;
        this.f24089b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24088a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
                ((View) this.f24089b).setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * g0.L(4.0f)));
                return;
            case 1:
                au auVar = (au) this.f24089b;
                auVar.getClass();
                auVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                auVar.f22963t.run();
                return;
            default:
                qu quVar = (qu) this.f24089b;
                quVar.getClass();
                quVar.f26456c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = quVar.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
