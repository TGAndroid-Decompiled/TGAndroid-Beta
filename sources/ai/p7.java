package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.a50;
public final class p7 extends AnimatorListenerAdapter {
    public final int f2011a;
    public final float f2012b;
    public final Runnable f2013c;
    public final Object d;

    public p7(Object obj, float f7, Runnable runnable, int i10) {
        this.f2011a = i10;
        this.d = obj;
        this.f2012b = f7;
        this.f2013c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f2011a;
        Runnable runnable = this.f2013c;
        float f7 = this.f2012b;
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
                ci.x1 x1Var = (ci.x1) obj;
                x1Var.f6150n = f7;
                x1Var.invalidate();
                if (animator == x1Var.f6151r && runnable != null) {
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
                vbVar.f10000r.invalidate();
                vbVar.f9987n.invalidate();
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
                vbVar.f10000r.invalidate();
                vbVar.f9971h0.invalidate();
                return;
            default:
                a50 a50Var = (a50) obj;
                a50Var.h = f7;
                a50Var.f35278a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
