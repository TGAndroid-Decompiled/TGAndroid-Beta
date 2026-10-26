package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.e50;
public final class l7 extends AnimatorListenerAdapter {
    public final int f5028a;
    public final float f5029b;
    public final Runnable f5030c;
    public final Object d;

    public l7(Object obj, float f7, Runnable runnable, int i10) {
        this.f5028a = i10;
        this.d = obj;
        this.f5029b = f7;
        this.f5030c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f5028a;
        Runnable runnable = this.f5030c;
        float f7 = this.f5029b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                m7 m7Var = (m7) obj;
                m7Var.f5096y = f7;
                m7Var.invalidate();
                if (animator == m7Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                di.w1 w1Var = (di.w1) obj;
                w1Var.f9292n = f7;
                w1Var.invalidate();
                if (animator == w1Var.f9293r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                fi.q2 q2Var = (fi.q2) obj;
                q2Var.h = f7;
                q2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                fi.sb sbVar = (fi.sb) obj;
                sbVar.L = null;
                sbVar.I = f7;
                sbVar.j();
                sbVar.f11658r.invalidate();
                sbVar.f11645n.invalidate();
                runnable.run();
                sbVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                sbVar.n();
                Runnable runnable2 = sbVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    sbVar.Q = null;
                }
                sbVar.f11658r.invalidate();
                sbVar.f11629h0.invalidate();
                return;
            default:
                e50 e50Var = (e50) obj;
                e50Var.h = f7;
                e50Var.f38992a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
