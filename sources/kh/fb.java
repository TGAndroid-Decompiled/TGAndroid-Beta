package kh;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.oc1;
import org.telegram.ui.xc;
import org.telegram.ui.zo0;
public final class fb implements ValueAnimator.AnimatorUpdateListener {
    public final int f15241a;
    public boolean f15242b = false;
    public final NotificationCenter.NotificationCenterDelegate f15243c;

    public fb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.f15241a = i9;
        this.f15243c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15241a) {
            case 0:
                wb wbVar = (wb) this.f15243c;
                wbVar.f16331z2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eb ebVar = wbVar.f16328y2;
                if (ebVar != null) {
                    ebVar.invalidate();
                }
                if (!this.f15242b && wbVar.f16331z2 > 0.5f) {
                    this.f15242b = true;
                    return;
                }
                return;
            case 1:
                xc xcVar = (xc) this.f15243c;
                xcVar.f44474j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xcVar.f44473i0.invalidate();
                if (!this.f15242b && xcVar.f44474j0 > 0.5f) {
                    this.f15242b = true;
                    return;
                }
                return;
            case 2:
                zo0 zo0Var = (zo0) this.f15243c;
                zo0Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zo0Var.K.invalidate();
                if (!this.f15242b && zo0Var.L > 0.5f) {
                    this.f15242b = true;
                    return;
                }
                return;
            default:
                oc1 oc1Var = (oc1) this.f15243c;
                oc1Var.f41073e2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oc1Var.f41069d2.invalidate();
                if (!this.f15242b && oc1Var.f41073e2 > 0.5f) {
                    this.f15242b = true;
                    return;
                }
                return;
        }
    }
}
