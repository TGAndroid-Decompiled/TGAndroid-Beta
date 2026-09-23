package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.od1;
import org.telegram.ui.up0;
public final class ub implements ValueAnimator.AnimatorUpdateListener {
    public final int f5639a;
    public boolean f5640b = false;
    public final NotificationCenter.NotificationCenterDelegate f5641c;

    public ub(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5639a = i10;
        this.f5641c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5639a) {
            case 0:
                lc lcVar = (lc) this.f5641c;
                lcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tb tbVar = lcVar.C2;
                if (tbVar != null) {
                    tbVar.invalidate();
                }
                if (!this.f5640b && lcVar.D2 > 0.5f) {
                    this.f5640b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ad adVar = (org.telegram.ui.ad) this.f5641c;
                adVar.f31755n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                adVar.m0.invalidate();
                if (!this.f5640b && adVar.f31755n0 > 0.5f) {
                    this.f5640b = true;
                    return;
                }
                return;
            case 2:
                up0 up0Var = (up0) this.f5641c;
                up0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                up0Var.X.invalidate();
                if (!this.f5640b && up0Var.Y > 0.5f) {
                    this.f5640b = true;
                    return;
                }
                return;
            default:
                od1 od1Var = (od1) this.f5641c;
                od1Var.f35809i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                od1Var.f35806h2.invalidate();
                if (!this.f5640b && od1Var.f35809i2 > 0.5f) {
                    this.f5640b = true;
                    return;
                }
                return;
        }
    }
}
