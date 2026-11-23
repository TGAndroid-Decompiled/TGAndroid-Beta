package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.h61;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f26431a;
    public final Object f26432b;
    public final Object f26433c;

    public q(int i7, Object obj, Object obj2) {
        this.f26431a = i7;
        this.f26432b = obj;
        this.f26433c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f26431a) {
            case 0:
                org.telegram.ui.Components.ch chVar = (org.telegram.ui.Components.ch) this.f26432b;
                Window window = (Window) this.f26433c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (chVar != null) {
                    org.telegram.ui.Components.ti tiVar = chVar.f34055b;
                    tiVar.G0 = -1;
                    tiVar.H0 = intValue;
                    tiVar.f30226b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                h61 h61Var = (h61) this.f26433c;
                if (((MediaController) this.f26432b).Y != 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                h61Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f10);
                return;
            default:
                zu zuVar = (zu) this.f26432b;
                View view = (View) this.f26433c;
                zuVar.getClass();
                zuVar.f28452a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
