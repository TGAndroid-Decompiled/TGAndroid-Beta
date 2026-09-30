package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.od1;
import org.telegram.ui.sp0;
public final class ub implements ValueAnimator.AnimatorUpdateListener {
    public final int f5648a;
    public boolean f5649b = false;
    public final NotificationCenter.NotificationCenterDelegate f5650c;

    public ub(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5648a = i10;
        this.f5650c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5648a) {
            case 0:
                lc lcVar = (lc) this.f5650c;
                lcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tb tbVar = lcVar.C2;
                if (tbVar != null) {
                    tbVar.invalidate();
                }
                if (!this.f5649b && lcVar.D2 > 0.5f) {
                    this.f5649b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ad adVar = (org.telegram.ui.ad) this.f5650c;
                adVar.f32190n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                adVar.m0.invalidate();
                if (!this.f5649b && adVar.f32190n0 > 0.5f) {
                    this.f5649b = true;
                    return;
                }
                return;
            case 2:
                sp0 sp0Var = (sp0) this.f5650c;
                sp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sp0Var.X.invalidate();
                if (!this.f5649b && sp0Var.Y > 0.5f) {
                    this.f5649b = true;
                    return;
                }
                return;
            default:
                od1 od1Var = (od1) this.f5650c;
                od1Var.f36318i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                od1Var.f36315h2.invalidate();
                if (!this.f5649b && od1Var.f36318i2 > 0.5f) {
                    this.f5649b = true;
                    return;
                }
                return;
        }
    }
}
