package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.t51;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f24652a;
    public final Object f24653b;
    public final Object f24654c;

    public q(int i7, Object obj, Object obj2) {
        this.f24652a = i7;
        this.f24653b = obj;
        this.f24654c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f24652a) {
            case 0:
                org.telegram.ui.Components.mg mgVar = (org.telegram.ui.Components.mg) this.f24653b;
                Window window = (Window) this.f24654c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (mgVar != null) {
                    org.telegram.ui.Components.di diVar = mgVar.f35952b;
                    diVar.F0 = -1;
                    diVar.G0 = intValue;
                    diVar.f28616b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                t51 t51Var = (t51) this.f24654c;
                if (((MediaController) this.f24653b).X != 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                t51Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f10);
                return;
            default:
                fv fvVar = (fv) this.f24653b;
                View view = (View) this.f24654c;
                fvVar.getClass();
                fvVar.f22461a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
