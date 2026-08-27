package lh;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ap0;
import org.telegram.ui.nc1;
import org.telegram.ui.xc;

public final class cb implements ValueAnimator.AnimatorUpdateListener {

    public final int f15761a;

    public boolean f15762b = false;

    public final NotificationCenter.NotificationCenterDelegate f15763c;

    public cb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f15761a = i10;
        this.f15763c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15761a) {
            case 0:
                sb sbVar = (sb) this.f15763c;
                sbVar.f16827z2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bb bbVar = sbVar.f16824y2;
                if (bbVar != null) {
                    bbVar.invalidate();
                }
                if (!this.f15762b && sbVar.f16827z2 > 0.5f) {
                    this.f15762b = true;
                    break;
                }
                break;
            case 1:
                xc xcVar = (xc) this.f15763c;
                xcVar.f44394j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xcVar.f44393i0.invalidate();
                if (!this.f15762b && xcVar.f44394j0 > 0.5f) {
                    this.f15762b = true;
                    break;
                }
                break;
            case 2:
                ap0 ap0Var = (ap0) this.f15763c;
                ap0Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ap0Var.K.invalidate();
                if (!this.f15762b && ap0Var.L > 0.5f) {
                    this.f15762b = true;
                    break;
                }
                break;
            default:
                nc1 nc1Var = (nc1) this.f15763c;
                nc1Var.f40752e2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nc1Var.f40748d2.invalidate();
                if (!this.f15762b && nc1Var.f40752e2 > 0.5f) {
                    this.f15762b = true;
                    break;
                }
                break;
        }
    }
}
