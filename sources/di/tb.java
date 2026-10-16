package di;

import android.animation.ValueAnimator;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ce1;
import org.telegram.ui.eq0;
public final class tb implements ValueAnimator.AnimatorUpdateListener {
    public final int f7863a;
    public boolean f7864b = false;
    public final NotificationCenter.NotificationCenterDelegate f7865c;

    public tb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f7863a = i10;
        this.f7865c = notificationCenterDelegate;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7863a) {
            case 0:
                kc kcVar = (kc) this.f7865c;
                kcVar.D2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sb sbVar = kcVar.C2;
                if (sbVar != null) {
                    sbVar.invalidate();
                }
                if (!this.f7864b && kcVar.D2 > 0.5f) {
                    this.f7864b = true;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.gd gdVar = (org.telegram.ui.gd) this.f7865c;
                gdVar.f36154n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gdVar.m0.invalidate();
                if (!this.f7864b && gdVar.f36154n0 > 0.5f) {
                    this.f7864b = true;
                    return;
                }
                return;
            case 2:
                eq0 eq0Var = (eq0) this.f7865c;
                eq0Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                eq0Var.X.invalidate();
                if (!this.f7864b && eq0Var.Y > 0.5f) {
                    this.f7864b = true;
                    return;
                }
                return;
            default:
                ce1 ce1Var = (ce1) this.f7865c;
                ce1Var.f34606i2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ce1Var.f34603h2.invalidate();
                if (!this.f7864b && ce1Var.f34606i2 > 0.5f) {
                    this.f7864b = true;
                    return;
                }
                return;
        }
    }
}
