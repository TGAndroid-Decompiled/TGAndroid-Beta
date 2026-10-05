package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.r50;
public final class t2 extends AnimatorListenerAdapter {
    public final int f1680a;
    public final float f1681b;
    public final Runnable f1682c;
    public final Object d;

    public t2(Object obj, float f7, Runnable runnable, int i10) {
        this.f1680a = i10;
        this.d = obj;
        this.f1681b = f7;
        this.f1682c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f1680a;
        Runnable runnable = this.f1682c;
        float f7 = this.f1681b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                w2 w2Var = (w2) obj;
                w2Var.f1794n = f7;
                w2Var.invalidate();
                if (animator == w2Var.f1795r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ci.x2 x2Var = (ci.x2) obj;
                x2Var.h = f7;
                x2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                ci.kc kcVar = (ci.kc) obj;
                kcVar.L = null;
                kcVar.I = f7;
                kcVar.k();
                kcVar.f5428r.invalidate();
                kcVar.f5415n.invalidate();
                runnable.run();
                kcVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                kcVar.o();
                Runnable runnable2 = kcVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    kcVar.Q = null;
                }
                kcVar.f5428r.invalidate();
                kcVar.f5399h0.invalidate();
                return;
            case 3:
                r50 r50Var = (r50) obj;
                r50Var.h = f7;
                r50Var.f39987a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                yh.c4 c4Var = (yh.c4) obj;
                c4Var.f51193y = f7;
                c4Var.invalidate();
                if (animator == c4Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
