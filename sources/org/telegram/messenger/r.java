package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.v61;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f17870a;
    public final Object f17871b;
    public final Object f17872c;

    public r(int i10, Object obj, Object obj2) {
        this.f17870a = i10;
        this.f17871b = obj;
        this.f17872c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f17870a) {
            case 0:
                org.telegram.ui.Components.ig igVar = (org.telegram.ui.Components.ig) this.f17871b;
                Window window = (Window) this.f17872c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (igVar != null) {
                    org.telegram.ui.Components.bi biVar = igVar.f27091b;
                    biVar.F0 = -1;
                    biVar.G0 = intValue;
                    biVar.f21587b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                v61 v61Var = (v61) this.f17872c;
                if (((MediaController) this.f17871b).X != 1) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                v61Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f7);
                return;
            default:
                rv rvVar = (rv) this.f17871b;
                View view = (View) this.f17872c;
                rvVar.getClass();
                rvVar.f17977a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
