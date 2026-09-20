package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.cq0;
import org.telegram.ui.xd1;
public final class xb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5786a;
    public boolean f5787b = false;
    public final NotificationCenter.NotificationCenterDelegate f5788c;

    public xb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5786a = i10;
        this.f5788c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5786a) {
            case 0:
                oc ocVar = (oc) this.f5788c;
                ocVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wb wbVar = ocVar.C2;
                if (wbVar != null) {
                    wbVar.invalidate();
                }
                if (!this.f5787b && ocVar.D2 > 0.5f) {
                    this.f5787b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.bd bdVar = (org.telegram.ui.bd) this.f5788c;
                bdVar.f32371n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.f5787b && bdVar.f32371n0 > 0.5f) {
                    this.f5787b = true;
                    return;
                }
                return;
            case 2:
                cq0 cq0Var = (cq0) this.f5788c;
                cq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cq0Var.X.invalidate();
                if (!this.f5787b && cq0Var.Y > 0.5f) {
                    this.f5787b = true;
                    return;
                }
                return;
            default:
                xd1 xd1Var = (xd1) this.f5788c;
                xd1Var.f39499i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var.f39496h2.invalidate();
                if (!this.f5787b && xd1Var.f39499i2 > 0.5f) {
                    this.f5787b = true;
                    return;
                }
                return;
        }
    }
}
