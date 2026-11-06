package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.s51;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f24644a;
    public final Object f24645b;
    public final Object f24646c;

    public q(int i7, Object obj, Object obj2) {
        this.f24644a = i7;
        this.f24645b = obj;
        this.f24646c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f24644a) {
            case 0:
                org.telegram.ui.Components.mg mgVar = (org.telegram.ui.Components.mg) this.f24645b;
                Window window = (Window) this.f24646c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (mgVar != null) {
                    org.telegram.ui.Components.di diVar = mgVar.f35936b;
                    diVar.F0 = -1;
                    diVar.G0 = intValue;
                    diVar.f28615b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                s51 s51Var = (s51) this.f24646c;
                if (((MediaController) this.f24645b).X != 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                s51Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f10);
                return;
            default:
                fv fvVar = (fv) this.f24645b;
                View view = (View) this.f24646c;
                fvVar.getClass();
                fvVar.f22454a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
