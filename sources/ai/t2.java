package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.p50;
public final class t2 extends AnimatorListenerAdapter {
    public final int f1546a;
    public final float f1547b;
    public final Runnable f1548c;
    public final Object d;

    public t2(Object obj, float f7, Runnable runnable, int i10) {
        this.f1546a = i10;
        this.d = obj;
        this.f1547b = f7;
        this.f1548c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f1546a;
        Runnable runnable = this.f1548c;
        float f7 = this.f1547b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                w2 w2Var = (w2) obj;
                w2Var.f1648n = f7;
                w2Var.invalidate();
                if (animator == w2Var.f1649r && runnable != null) {
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
                kcVar.f5035r.invalidate();
                kcVar.f5022n.invalidate();
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
                kcVar.f5035r.invalidate();
                kcVar.f5006h0.invalidate();
                return;
            case 3:
                p50 p50Var = (p50) obj;
                p50Var.h = f7;
                p50Var.f36328a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                yh.b4 b4Var = (yh.b4) obj;
                b4Var.f47285y = f7;
                b4Var.invalidate();
                if (animator == b4Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
