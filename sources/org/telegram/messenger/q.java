package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.i61;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f26339a;
    public final Object f26340b;
    public final Object f26341c;

    public q(int i7, Object obj, Object obj2) {
        this.f26339a = i7;
        this.f26340b = obj;
        this.f26341c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f26339a) {
            case 0:
                org.telegram.ui.Components.dh dhVar = (org.telegram.ui.Components.dh) this.f26340b;
                Window window = (Window) this.f26341c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (dhVar != null) {
                    org.telegram.ui.Components.ui uiVar = dhVar.f34459b;
                    uiVar.G0 = -1;
                    uiVar.H0 = intValue;
                    uiVar.f30142b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                i61 i61Var = (i61) this.f26341c;
                if (((MediaController) this.f26340b).Y != 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                i61Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f10);
                return;
            default:
                av avVar = (av) this.f26340b;
                View view = (View) this.f26341c;
                avVar.getClass();
                avVar.f22943a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
