package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import di.pc;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.s50;
public final class h2 extends AnimatorListenerAdapter {
    public final int f3076a;
    public final float f3077b;
    public final Runnable f3078c;
    public final Object d;

    public h2(Object obj, float f7, Runnable runnable, int i10) {
        this.f3076a = i10;
        this.d = obj;
        this.f3077b = f7;
        this.f3078c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f3076a;
        Runnable runnable = this.f3078c;
        float f7 = this.f3077b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                k2 k2Var = (k2) obj;
                k2Var.f3218n = f7;
                k2Var.invalidate();
                if (animator == k2Var.f3219r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                di.y2 y2Var = (di.y2) obj;
                y2Var.h = f7;
                y2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                pc pcVar = (pc) obj;
                pcVar.L = null;
                pcVar.I = f7;
                pcVar.k();
                pcVar.f7923r.invalidate();
                pcVar.f7910n.invalidate();
                runnable.run();
                pcVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                pcVar.o();
                Runnable runnable2 = pcVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    pcVar.Q = null;
                }
                pcVar.f7923r.invalidate();
                pcVar.f7894h0.invalidate();
                return;
            case 3:
                s50 s50Var = (s50) obj;
                s50Var.h = f7;
                s50Var.f40329a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                zh.a4 a4Var = (zh.a4) obj;
                a4Var.f51719y = f7;
                a4Var.invalidate();
                if (animator == a4Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
