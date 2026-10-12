package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import di.kc;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.w50;
public final class i2 extends AnimatorListenerAdapter {
    public final int f3162a;
    public final float f3163b;
    public final Runnable f3164c;
    public final Object d;

    public i2(Object obj, float f7, Runnable runnable, int i10) {
        this.f3162a = i10;
        this.d = obj;
        this.f3163b = f7;
        this.f3164c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f3162a;
        Runnable runnable = this.f3164c;
        float f7 = this.f3163b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l2 l2Var = (l2) obj;
                l2Var.f3267n = f7;
                l2Var.invalidate();
                if (animator == l2Var.f3268r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                di.w2 w2Var = (di.w2) obj;
                w2Var.h = f7;
                w2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                kc kcVar = (kc) obj;
                kcVar.L = null;
                kcVar.I = f7;
                kcVar.j();
                kcVar.f7287r.invalidate();
                kcVar.f7274n.invalidate();
                runnable.run();
                kcVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                kcVar.n();
                Runnable runnable2 = kcVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    kcVar.Q = null;
                }
                kcVar.f7287r.invalidate();
                kcVar.f7258h0.invalidate();
                return;
            case 3:
                w50 w50Var = (w50) obj;
                w50Var.h = f7;
                w50Var.f41154a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                zh.v3 v3Var = (zh.v3) obj;
                v3Var.f51245y = f7;
                v3Var.invalidate();
                if (animator == v3Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
