package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bd;
import org.telegram.ui.rp0;
import org.telegram.ui.tc1;
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final int f10578a;
    public boolean f10579b = false;
    public final NotificationCenter.NotificationCenterDelegate f10580c;

    public bb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f10578a = i10;
        this.f10580c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10578a) {
            case 0:
                sb sbVar = (sb) this.f10580c;
                sbVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ab abVar = sbVar.C2;
                if (abVar != null) {
                    abVar.invalidate();
                }
                if (!this.f10579b && sbVar.D2 > 0.5f) {
                    this.f10579b = true;
                    return;
                }
                return;
            case 1:
                bd bdVar = (bd) this.f10580c;
                bdVar.f38052n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.f10579b && bdVar.f38052n0 > 0.5f) {
                    this.f10579b = true;
                    return;
                }
                return;
            case 2:
                rp0 rp0Var = (rp0) this.f10580c;
                rp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rp0Var.X.invalidate();
                if (!this.f10579b && rp0Var.Y > 0.5f) {
                    this.f10579b = true;
                    return;
                }
                return;
            default:
                tc1 tc1Var = (tc1) this.f10580c;
                tc1Var.f43768j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tc1Var.f43765i2.invalidate();
                if (!this.f10579b && tc1Var.f43768j2 > 0.5f) {
                    this.f10579b = true;
                    return;
                }
                return;
        }
    }
}
