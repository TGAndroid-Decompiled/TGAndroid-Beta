package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.u61;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f17668a;
    public final Object f17669b;
    public final Object f17670c;

    public r(int i10, Object obj, Object obj2) {
        this.f17668a = i10;
        this.f17669b = obj;
        this.f17670c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f17668a) {
            case 0:
                org.telegram.ui.Components.ig igVar = (org.telegram.ui.Components.ig) this.f17669b;
                Window window = (Window) this.f17670c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (igVar != null) {
                    org.telegram.ui.Components.bi biVar = igVar.f26976b;
                    biVar.F0 = -1;
                    biVar.G0 = intValue;
                    biVar.f21586b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                u61 u61Var = (u61) this.f17670c;
                if (((MediaController) this.f17669b).X != 1) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.2f;
                }
                u61Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f7);
                return;
            default:
                qv qvVar = (qv) this.f17669b;
                View view = (View) this.f17670c;
                qvVar.getClass();
                qvVar.f17631a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
