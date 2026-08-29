package nh;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.qc1;
import org.telegram.ui.vc;
import org.telegram.ui.yo0;
public final class qa implements ValueAnimator.AnimatorUpdateListener {
    public final int f18410a;
    public boolean f18411b = false;
    public final NotificationCenter.NotificationCenterDelegate f18412c;

    public qa(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f18410a = i10;
        this.f18412c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18410a) {
            case 0:
                gb gbVar = (gb) this.f18412c;
                gbVar.f17821z2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pa paVar = gbVar.f17818y2;
                if (paVar != null) {
                    paVar.invalidate();
                }
                if (!this.f18411b && gbVar.f17821z2 > 0.5f) {
                    this.f18411b = true;
                    return;
                }
                return;
            case 1:
                vc vcVar = (vc) this.f18412c;
                vcVar.f43516j0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vcVar.f43515i0.invalidate();
                if (!this.f18411b && vcVar.f43516j0 > 0.5f) {
                    this.f18411b = true;
                    return;
                }
                return;
            case 2:
                yo0 yo0Var = (yo0) this.f18412c;
                yo0Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yo0Var.K.invalidate();
                if (!this.f18411b && yo0Var.L > 0.5f) {
                    this.f18411b = true;
                    return;
                }
                return;
            default:
                qc1 qc1Var = (qc1) this.f18412c;
                qc1Var.f41640e2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qc1Var.f41636d2.invalidate();
                if (!this.f18411b && qc1Var.f41640e2 > 0.5f) {
                    this.f18411b = true;
                    return;
                }
                return;
        }
    }
}
