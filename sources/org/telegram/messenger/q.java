package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.i61;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f26352a;
    public final Object f26353b;
    public final Object f26354c;

    public q(int i7, Object obj, Object obj2) {
        this.f26352a = i7;
        this.f26353b = obj;
        this.f26354c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f26352a) {
            case 0:
                org.telegram.ui.Components.dh dhVar = (org.telegram.ui.Components.dh) this.f26353b;
                Window window = (Window) this.f26354c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (dhVar != null) {
                    org.telegram.ui.Components.ui uiVar = dhVar.f34502b;
                    uiVar.G0 = -1;
                    uiVar.H0 = intValue;
                    uiVar.f30173b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                i61 i61Var = (i61) this.f26354c;
                if (((MediaController) this.f26353b).Y != 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                i61Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f10);
                return;
            default:
                zu zuVar = (zu) this.f26353b;
                View view = (View) this.f26354c;
                zuVar.getClass();
                zuVar.f28388a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
