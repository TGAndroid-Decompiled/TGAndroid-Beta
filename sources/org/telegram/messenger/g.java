package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f23581a;
    public final Object f23582b;

    public g(Object obj, int i7) {
        this.f23581a = i7;
        this.f23582b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f23581a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
                ((View) this.f23582b).setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * g0.L(4.0f)));
                return;
            case 1:
                du duVar = (du) this.f23582b;
                duVar.getClass();
                duVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                duVar.f23158t.run();
                return;
            default:
                uu uuVar = (uu) this.f23582b;
                uuVar.getClass();
                uuVar.f26871c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = uuVar.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
