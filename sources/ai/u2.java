package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.p50;
public final class u2 extends AnimatorListenerAdapter {
    public final int f1788a;
    public final float f1789b;
    public final Runnable f1790c;
    public final Object d;

    public u2(Object obj, float f7, Runnable runnable, int i10) {
        this.f1788a = i10;
        this.d = obj;
        this.f1789b = f7;
        this.f1790c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f1788a;
        Runnable runnable = this.f1790c;
        float f7 = this.f1789b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                x2 x2Var = (x2) obj;
                x2Var.f1900n = f7;
                x2Var.invalidate();
                if (animator == x2Var.f1901r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ci.w2 w2Var = (ci.w2) obj;
                w2Var.h = f7;
                w2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                ci.lc lcVar = (ci.lc) obj;
                lcVar.L = null;
                lcVar.I = f7;
                lcVar.j();
                lcVar.f5512r.invalidate();
                lcVar.f5499n.invalidate();
                runnable.run();
                lcVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                lcVar.n();
                Runnable runnable2 = lcVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    lcVar.Q = null;
                }
                lcVar.f5512r.invalidate();
                lcVar.f5483h0.invalidate();
                return;
            case 3:
                p50 p50Var = (p50) obj;
                p50Var.h = f7;
                p50Var.f40713a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                yh.w3 w3Var = (yh.w3) obj;
                w3Var.f53385y = f7;
                w3Var.invalidate();
                if (animator == w3Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
