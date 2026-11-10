package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.t51;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f24662a;
    public final Object f24663b;
    public final Object f24664c;

    public q(int i7, Object obj, Object obj2) {
        this.f24662a = i7;
        this.f24663b = obj;
        this.f24664c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f24662a) {
            case 0:
                org.telegram.ui.Components.lg lgVar = (org.telegram.ui.Components.lg) this.f24663b;
                Window window = (Window) this.f24664c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (lgVar != null) {
                    org.telegram.ui.Components.ci ciVar = lgVar.f35668b;
                    ciVar.F0 = -1;
                    ciVar.G0 = intValue;
                    ciVar.f28672b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                t51 t51Var = (t51) this.f24664c;
                if (((MediaController) this.f24663b).X != 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                t51Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f10);
                return;
            default:
                fv fvVar = (fv) this.f24663b;
                View view = (View) this.f24664c;
                fvVar.getClass();
                fvVar.f22484a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
