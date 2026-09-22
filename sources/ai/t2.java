package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.r50;
public final class t2 extends AnimatorListenerAdapter {
    public final int f1542a;
    public final float f1543b;
    public final Runnable f1544c;
    public final Object d;

    public t2(Object obj, float f7, Runnable runnable, int i10) {
        this.f1542a = i10;
        this.d = obj;
        this.f1543b = f7;
        this.f1544c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f1542a;
        Runnable runnable = this.f1544c;
        float f7 = this.f1543b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                w2 w2Var = (w2) obj;
                w2Var.f1642n = f7;
                w2Var.invalidate();
                if (animator == w2Var.f1643r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ci.y2 y2Var = (ci.y2) obj;
                y2Var.h = f7;
                y2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                ci.oc ocVar = (ci.oc) obj;
                ocVar.L = null;
                ocVar.I = f7;
                ocVar.k();
                ocVar.f5254r.invalidate();
                ocVar.f5241n.invalidate();
                runnable.run();
                ocVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                ocVar.o();
                Runnable runnable2 = ocVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    ocVar.Q = null;
                }
                ocVar.f5254r.invalidate();
                ocVar.f5225h0.invalidate();
                return;
            case 3:
                r50 r50Var = (r50) obj;
                r50Var.h = f7;
                r50Var.f37027a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                yh.d4 d4Var = (yh.d4) obj;
                d4Var.f47017y = f7;
                d4Var.invalidate();
                if (animator == d4Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
