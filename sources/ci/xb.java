package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.aq0;
import org.telegram.ui.vd1;
public final class xb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5780a;
    public boolean f5781b = false;
    public final NotificationCenter.NotificationCenterDelegate f5782c;

    public xb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5780a = i10;
        this.f5782c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5780a) {
            case 0:
                oc ocVar = (oc) this.f5782c;
                ocVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wb wbVar = ocVar.C2;
                if (wbVar != null) {
                    wbVar.invalidate();
                }
                if (!this.f5781b && ocVar.D2 > 0.5f) {
                    this.f5781b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ad adVar = (org.telegram.ui.ad) this.f5782c;
                adVar.f31770n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                adVar.m0.invalidate();
                if (!this.f5781b && adVar.f31770n0 > 0.5f) {
                    this.f5781b = true;
                    return;
                }
                return;
            case 2:
                aq0 aq0Var = (aq0) this.f5782c;
                aq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aq0Var.X.invalidate();
                if (!this.f5781b && aq0Var.Y > 0.5f) {
                    this.f5781b = true;
                    return;
                }
                return;
            default:
                vd1 vd1Var = (vd1) this.f5782c;
                vd1Var.f38542i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vd1Var.f38539h2.invalidate();
                if (!this.f5781b && vd1Var.f38542i2 > 0.5f) {
                    this.f5781b = true;
                    return;
                }
                return;
        }
    }
}
