package ci;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.rd1;
import org.telegram.ui.wp0;
public final class tb implements ValueAnimator.AnimatorUpdateListener {
    public final int f6022a;
    public boolean f6023b = false;
    public final NotificationCenter.NotificationCenterDelegate f6024c;

    public tb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f6022a = i10;
        this.f6024c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6022a) {
            case 0:
                kc kcVar = (kc) this.f6024c;
                kcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar = kcVar.C2;
                if (sbVar != null) {
                    sbVar.invalidate();
                }
                if (!this.f6023b && kcVar.D2 > 0.5f) {
                    this.f6023b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.cd cdVar = (org.telegram.ui.cd) this.f6024c;
                cdVar.f35432n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cdVar.m0.invalidate();
                if (!this.f6023b && cdVar.f35432n0 > 0.5f) {
                    this.f6023b = true;
                    return;
                }
                return;
            case 2:
                wp0 wp0Var = (wp0) this.f6024c;
                wp0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wp0Var.X.invalidate();
                if (!this.f6023b && wp0Var.Y > 0.5f) {
                    this.f6023b = true;
                    return;
                }
                return;
            default:
                rd1 rd1Var = (rd1) this.f6024c;
                rd1Var.f40067i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rd1Var.f40064h2.invalidate();
                if (!this.f6023b && rd1Var.f40067i2 > 0.5f) {
                    this.f6023b = true;
                    return;
                }
                return;
        }
    }
}
