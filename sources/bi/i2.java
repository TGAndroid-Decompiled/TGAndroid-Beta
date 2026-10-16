package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import di.kc;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.w50;
public final class i2 extends AnimatorListenerAdapter {
    public final int f3166a;
    public final float f3167b;
    public final Runnable f3168c;
    public final Object d;

    public i2(Object obj, float f7, Runnable runnable, int i10) {
        this.f3166a = i10;
        this.d = obj;
        this.f3167b = f7;
        this.f3168c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f3166a;
        Runnable runnable = this.f3168c;
        float f7 = this.f3167b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l2 l2Var = (l2) obj;
                l2Var.f3271n = f7;
                l2Var.invalidate();
                if (animator == l2Var.f3272r && runnable != null) {
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
                kcVar.f7290r.invalidate();
                kcVar.f7277n.invalidate();
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
                kcVar.f7290r.invalidate();
                kcVar.f7261h0.invalidate();
                return;
            case 3:
                w50 w50Var = (w50) obj;
                w50Var.h = f7;
                w50Var.f40861a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                zh.v3 v3Var = (zh.v3) obj;
                v3Var.f51246y = f7;
                v3Var.invalidate();
                if (animator == v3Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
