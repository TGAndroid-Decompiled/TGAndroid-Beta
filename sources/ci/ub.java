package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.cq0;
import org.telegram.ui.zd1;
public final class ub implements ValueAnimator.AnimatorUpdateListener {
    public final int f6101a;
    public boolean f6102b = false;
    public final NotificationCenter.NotificationCenterDelegate f6103c;

    public ub(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f6101a = i10;
        this.f6103c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6101a) {
            case 0:
                lc lcVar = (lc) this.f6103c;
                lcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tb tbVar = lcVar.C2;
                if (tbVar != null) {
                    tbVar.invalidate();
                }
                if (!this.f6102b && lcVar.D2 > 0.5f) {
                    this.f6102b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.fd fdVar = (org.telegram.ui.fd) this.f6103c;
                fdVar.f37738n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fdVar.m0.invalidate();
                if (!this.f6102b && fdVar.f37738n0 > 0.5f) {
                    this.f6102b = true;
                    return;
                }
                return;
            case 2:
                cq0 cq0Var = (cq0) this.f6103c;
                cq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cq0Var.X.invalidate();
                if (!this.f6102b && cq0Var.Y > 0.5f) {
                    this.f6102b = true;
                    return;
                }
                return;
            default:
                zd1 zd1Var = (zd1) this.f6103c;
                zd1Var.f44759i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zd1Var.f44756h2.invalidate();
                if (!this.f6102b && zd1Var.f44759i2 > 0.5f) {
                    this.f6102b = true;
                    return;
                }
                return;
        }
    }
}
