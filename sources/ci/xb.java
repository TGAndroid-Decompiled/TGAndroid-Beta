package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.aq0;
import org.telegram.ui.wd1;
public final class xb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5782a;
    public boolean f5783b = false;
    public final NotificationCenter.NotificationCenterDelegate f5784c;

    public xb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5782a = i10;
        this.f5784c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5782a) {
            case 0:
                oc ocVar = (oc) this.f5784c;
                ocVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wb wbVar = ocVar.C2;
                if (wbVar != null) {
                    wbVar.invalidate();
                }
                if (!this.f5783b && ocVar.D2 > 0.5f) {
                    this.f5783b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ad adVar = (org.telegram.ui.ad) this.f5784c;
                adVar.f31752n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                adVar.m0.invalidate();
                if (!this.f5783b && adVar.f31752n0 > 0.5f) {
                    this.f5783b = true;
                    return;
                }
                return;
            case 2:
                aq0 aq0Var = (aq0) this.f5784c;
                aq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                aq0Var.X.invalidate();
                if (!this.f5783b && aq0Var.Y > 0.5f) {
                    this.f5783b = true;
                    return;
                }
                return;
            default:
                wd1 wd1Var = (wd1) this.f5784c;
                wd1Var.f38815i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wd1Var.f38812h2.invalidate();
                if (!this.f5783b && wd1Var.f38815i2 > 0.5f) {
                    this.f5783b = true;
                    return;
                }
                return;
        }
    }
}
