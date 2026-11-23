package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f24196a;
    public final Object f24197b;

    public g(Object obj, int i7) {
        this.f24196a = i7;
        this.f24197b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24196a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
                ((View) this.f24197b).setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * g0.L(4.0f)));
                return;
            case 1:
                au auVar = (au) this.f24197b;
                auVar.getClass();
                auVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                auVar.f23074t.run();
                return;
            default:
                qu quVar = (qu) this.f24197b;
                quVar.getClass();
                quVar.f26568c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = quVar.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
