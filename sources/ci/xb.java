package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.cq0;
import org.telegram.ui.xd1;
public final class xb implements ValueAnimator.AnimatorUpdateListener {
    public final int f5785a;
    public boolean f5786b = false;
    public final NotificationCenter.NotificationCenterDelegate f5787c;

    public xb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f5785a = i10;
        this.f5787c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5785a) {
            case 0:
                oc ocVar = (oc) this.f5787c;
                ocVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wb wbVar = ocVar.C2;
                if (wbVar != null) {
                    wbVar.invalidate();
                }
                if (!this.f5786b && ocVar.D2 > 0.5f) {
                    this.f5786b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.cd cdVar = (org.telegram.ui.cd) this.f5787c;
                cdVar.f32745n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cdVar.m0.invalidate();
                if (!this.f5786b && cdVar.f32745n0 > 0.5f) {
                    this.f5786b = true;
                    return;
                }
                return;
            case 2:
                cq0 cq0Var = (cq0) this.f5787c;
                cq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cq0Var.X.invalidate();
                if (!this.f5786b && cq0Var.Y > 0.5f) {
                    this.f5786b = true;
                    return;
                }
                return;
            default:
                xd1 xd1Var = (xd1) this.f5787c;
                xd1Var.f39565i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xd1Var.f39562h2.invalidate();
                if (!this.f5786b && xd1Var.f39565i2 > 0.5f) {
                    this.f5786b = true;
                    return;
                }
                return;
        }
    }
}
