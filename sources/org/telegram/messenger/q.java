package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.u51;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f26044a;
    public final Object f26045b;
    public final Object f26046c;

    public q(int i7, Object obj, Object obj2) {
        this.f26044a = i7;
        this.f26045b = obj;
        this.f26046c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f26044a) {
            case 0:
                org.telegram.ui.Components.sg sgVar = (org.telegram.ui.Components.sg) this.f26045b;
                Window window = (Window) this.f26046c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (sgVar != null) {
                    org.telegram.ui.Components.ki kiVar = sgVar.f39302b;
                    kiVar.G0 = -1;
                    kiVar.H0 = intValue;
                    kiVar.f29682b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                u51 u51Var = (u51) this.f26046c;
                if (((MediaController) this.f26045b).Y != 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                u51Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f10);
                return;
            default:
                dv dvVar = (dv) this.f26045b;
                View view = (View) this.f26046c;
                dvVar.getClass();
                dvVar.f23157a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
