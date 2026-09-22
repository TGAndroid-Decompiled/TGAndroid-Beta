package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.cq0;
import org.telegram.ui.xd1;
public final class xb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5784a;
    public boolean f5785b = false;
    public final NotificationCenter.NotificationCenterDelegate f5786c;

    public xb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5784a = i10;
        this.f5786c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5784a) {
            case 0:
                oc ocVar = (oc) this.f5786c;
                ocVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wb wbVar = ocVar.C2;
                if (wbVar != null) {
                    wbVar.invalidate();
                }
                if (!this.f5785b && ocVar.D2 > 0.5f) {
                    this.f5785b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.bd bdVar = (org.telegram.ui.bd) this.f5786c;
                bdVar.f32389n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.f5785b && bdVar.f32389n0 > 0.5f) {
                    this.f5785b = true;
                    return;
                }
                return;
            case 2:
                cq0 cq0Var = (cq0) this.f5786c;
                cq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cq0Var.X.invalidate();
                if (!this.f5785b && cq0Var.Y > 0.5f) {
                    this.f5785b = true;
                    return;
                }
                return;
            default:
                xd1 xd1Var = (xd1) this.f5786c;
                xd1Var.f39523i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var.f39520h2.invalidate();
                if (!this.f5785b && xd1Var.f39523i2 > 0.5f) {
                    this.f5785b = true;
                    return;
                }
                return;
        }
    }
}
