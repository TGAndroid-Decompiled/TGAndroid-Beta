package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f15647a;
    public final Object f15648b;

    public g(Object obj, int i10) {
        this.f15647a = i10;
        this.f15648b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15647a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
                ((View) this.f15648b).setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * i0.L(4.0f)));
                return;
            case 1:
                ru ruVar = (ru) this.f15648b;
                ruVar.getClass();
                ruVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ruVar.f17796t.run();
                return;
            default:
                hv hvVar = (hv) this.f15648b;
                hvVar.getClass();
                hvVar.f15959b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = hvVar.V;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
