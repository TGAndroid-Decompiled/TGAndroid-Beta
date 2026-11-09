package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.Window;
import org.telegram.ui.Components.u51;
public final class q implements ValueAnimator.AnimatorUpdateListener {
    public final int f24658a;
    public final Object f24659b;
    public final Object f24660c;

    public q(int i7, Object obj, Object obj2) {
        this.f24658a = i7;
        this.f24659b = obj;
        this.f24660c = obj2;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f24658a) {
            case 0:
                org.telegram.ui.Components.mg mgVar = (org.telegram.ui.Components.mg) this.f24659b;
                Window window = (Window) this.f24660c;
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (mgVar != null) {
                    org.telegram.ui.Components.di diVar = mgVar.f36084b;
                    diVar.F0 = -1;
                    diVar.G0 = intValue;
                    diVar.f28624b.invalidate();
                }
                try {
                    window.setNavigationBarColor(intValue);
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                u51 u51Var = (u51) this.f24660c;
                if (((MediaController) this.f24659b).X != 1) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.2f;
                }
                u51Var.B0(((Float) valueAnimator.getAnimatedValue()).floatValue() * f10);
                return;
            default:
                fv fvVar = (fv) this.f24659b;
                View view = (View) this.f24660c;
                fvVar.getClass();
                fvVar.f22480a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
        }
    }
}
