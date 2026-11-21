package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f24116a;
    public final Object f24117b;

    public g(Object obj, int i7) {
        this.f24116a = i7;
        this.f24117b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f24116a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
                ((View) this.f24117b).setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * g0.L(4.0f)));
                return;
            case 1:
                au auVar = (au) this.f24117b;
                auVar.getClass();
                auVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                auVar.f22991t.run();
                return;
            default:
                qu quVar = (qu) this.f24117b;
                quVar.getClass();
                quVar.f26484c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = quVar.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
