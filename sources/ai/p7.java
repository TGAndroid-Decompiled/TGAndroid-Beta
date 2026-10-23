package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.d50;
public final class p7 extends AnimatorListenerAdapter {
    public final int f2002a;
    public final float f2003b;
    public final Runnable f2004c;
    public final Object d;

    public p7(Object obj, float f7, Runnable runnable, int i10) {
        this.f2002a = i10;
        this.d = obj;
        this.f2003b = f7;
        this.f2004c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f2002a;
        Runnable runnable = this.f2004c;
        float f7 = this.f2003b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                q7 q7Var = (q7) obj;
                q7Var.f2073y = f7;
                q7Var.invalidate();
                if (animator == q7Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ci.w1 w1Var = (ci.w1) obj;
                w1Var.f6045n = f7;
                w1Var.invalidate();
                if (animator == w1Var.f6046r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                ei.s2 s2Var = (ei.s2) obj;
                s2Var.h = f7;
                s2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ei.vb vbVar = (ei.vb) obj;
                vbVar.L = null;
                vbVar.I = f7;
                vbVar.j();
                vbVar.f10017r.invalidate();
                vbVar.f10004n.invalidate();
                runnable.run();
                vbVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                vbVar.n();
                Runnable runnable2 = vbVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    vbVar.Q = null;
                }
                vbVar.f10017r.invalidate();
                vbVar.f9988h0.invalidate();
                return;
            default:
                d50 d50Var = (d50) obj;
                d50Var.h = f7;
                d50Var.f36505a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
