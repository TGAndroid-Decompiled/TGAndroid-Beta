package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.m50;
public final class t2 extends AnimatorListenerAdapter {
    public final int f1544a;
    public final float f1545b;
    public final Runnable f1546c;
    public final Object d;

    public t2(Object obj, float f7, Runnable runnable, int i10) {
        this.f1544a = i10;
        this.d = obj;
        this.f1545b = f7;
        this.f1546c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f1544a;
        Runnable runnable = this.f1546c;
        float f7 = this.f1545b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                w2 w2Var = (w2) obj;
                w2Var.f1646n = f7;
                w2Var.invalidate();
                if (animator == w2Var.f1647r && runnable != null) {
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
                ci.lc lcVar = (ci.lc) obj;
                lcVar.L = null;
                lcVar.I = f7;
                lcVar.k();
                lcVar.f5079r.invalidate();
                lcVar.f5066n.invalidate();
                runnable.run();
                lcVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                lcVar.o();
                Runnable runnable2 = lcVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    lcVar.Q = null;
                }
                lcVar.f5079r.invalidate();
                lcVar.f5050h0.invalidate();
                return;
            case 3:
                m50 m50Var = (m50) obj;
                m50Var.h = f7;
                m50Var.f35480a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                yh.b4 b4Var = (yh.b4) obj;
                b4Var.f47234y = f7;
                b4Var.invalidate();
                if (animator == b4Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
