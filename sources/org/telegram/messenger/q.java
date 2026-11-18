package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.f61;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f26326a;
    public final Object f26327b;
    public final Object f26328c;

    public q(int i7, Object obj, Object obj2) {
        this.f26326a = i7;
        this.f26327b = obj;
        this.f26328c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f26326a) {
            case 0:
                org.telegram.ui.Components.bh bhVar = (org.telegram.ui.Components.bh) this.f26327b;
                Window window = (Window) this.f26328c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (bhVar != null) {
                    org.telegram.ui.Components.si siVar = bhVar.f33687b;
                    siVar.G0 = -1;
                    siVar.H0 = intValue;
                    siVar.f30192b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                f61 f61Var = (f61) this.f26328c;
                if (((MediaController) this.f26327b).Y != 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                f61Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f10);
                return;
            default:
                zu zuVar = (zu) this.f26327b;
                View view = (View) this.f26328c;
                zuVar.getClass();
                zuVar.f28362a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
