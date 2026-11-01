package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f15830a;
    public final Object f15831b;

    public g(Object obj, int i10) {
        this.f15830a = i10;
        this.f15831b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15830a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
                ((View) this.f15831b).setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * i0.L(4.0f)));
                return;
            case 1:
                su suVar = (su) this.f15831b;
                suVar.getClass();
                suVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                suVar.f18160t.run();
                return;
            default:
                iv ivVar = (iv) this.f15831b;
                ivVar.getClass();
                ivVar.f16351b0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ivVar.V;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
