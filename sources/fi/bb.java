package fi;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.bd;
import org.telegram.ui.tp0;
import org.telegram.ui.vc1;
public final class bb implements ValueAnimator.AnimatorUpdateListener {
    public final int f10577a;
    public boolean f10578b = false;
    public final NotificationCenter.NotificationCenterDelegate f10579c;

    public bb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f10577a = i10;
        this.f10579c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10577a) {
            case 0:
                sb sbVar = (sb) this.f10579c;
                sbVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ab abVar = sbVar.C2;
                if (abVar != null) {
                    abVar.invalidate();
                }
                if (!this.f10578b && sbVar.D2 > 0.5f) {
                    this.f10578b = true;
                    return;
                }
                return;
            case 1:
                bd bdVar = (bd) this.f10579c;
                bdVar.f37994n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bdVar.m0.invalidate();
                if (!this.f10578b && bdVar.f37994n0 > 0.5f) {
                    this.f10578b = true;
                    return;
                }
                return;
            case 2:
                tp0 tp0Var = (tp0) this.f10579c;
                tp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tp0Var.X.invalidate();
                if (!this.f10578b && tp0Var.Y > 0.5f) {
                    this.f10578b = true;
                    return;
                }
                return;
            default:
                vc1 vc1Var = (vc1) this.f10579c;
                vc1Var.f44278j2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vc1Var.f44275i2.invalidate();
                if (!this.f10578b && vc1Var.f44278j2 > 0.5f) {
                    this.f10578b = true;
                    return;
                }
                return;
        }
    }
}
