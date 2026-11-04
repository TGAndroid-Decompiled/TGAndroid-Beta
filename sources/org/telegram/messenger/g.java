package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
public final class g implements ValueAnimator.AnimatorUpdateListener {
    public final int f22578a;
    public final Object f22579b;

    public g(Object obj, int i3) {
        this.f22578a = i3;
        this.f22579b = obj;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22578a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                double sin = Math.sin(floatValue * 3.141592653589793d * 4.0d);
                ((View) this.f22579b).setTranslationX((float) (sin * (1.0f - floatValue) * floatValue * 4.0f * g0.L(4.0f)));
                return;
            case 1:
                yt ytVar = (yt) this.f22579b;
                ytVar.getClass();
                ytVar.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ytVar.f26650t.run();
                return;
            default:
                ou ouVar = (ou) this.f22579b;
                ouVar.getClass();
                ouVar.f24603c0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = ouVar.W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
