package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.m51;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f24840a;
    public final Object f24841b;
    public final Object f24842c;

    public q(int i3, Object obj, Object obj2) {
        this.f24840a = i3;
        this.f24841b = obj;
        this.f24842c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f24840a) {
            case 0:
                org.telegram.ui.Components.kg kgVar = (org.telegram.ui.Components.kg) this.f24841b;
                Window window = (Window) this.f24842c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (kgVar != null) {
                    org.telegram.ui.Components.bi biVar = kgVar.f35396b;
                    biVar.G0 = -1;
                    biVar.H0 = intValue;
                    biVar.f28586b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                m51 m51Var = (m51) this.f24842c;
                if (((MediaController) this.f24841b).Y != 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                m51Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f10);
                return;
            default:
                xu xuVar = (xu) this.f24841b;
                View view = (View) this.f24842c;
                xuVar.getClass();
                xuVar.f26445a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
