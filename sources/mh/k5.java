package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.n50;
public final class k5 extends AnimatorListenerAdapter {
    public final int f14349a;
    public final float f14350b;
    public final Runnable f14351c;
    public final Object d;

    public k5(Object obj, float f10, Runnable runnable, int i10) {
        this.f14349a = i10;
        this.d = obj;
        this.f14350b = f10;
        this.f14351c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f14349a;
        Runnable runnable = this.f14351c;
        float f10 = this.f14350b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l5 l5Var = (l5) obj;
                l5Var.f14392y = f10;
                l5Var.invalidate();
                if (animator == l5Var.B && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                oh.r1 r1Var = (oh.r1) obj;
                r1Var.f17680n = f10;
                r1Var.invalidate();
                if (animator == r1Var.f17681r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                n50 n50Var = (n50) obj;
                n50Var.h = f10;
                n50Var.f39295a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                qh.d2 d2Var = (qh.d2) obj;
                d2Var.h = f10;
                d2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qh.ca caVar = (qh.ca) obj;
                caVar.I = null;
                caVar.F = f10;
                caVar.k();
                caVar.f45128r.invalidate();
                caVar.f45115n.invalidate();
                runnable.run();
                caVar.M.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                caVar.o();
                Runnable runnable2 = caVar.N;
                if (runnable2 != null) {
                    runnable2.run();
                    caVar.N = null;
                }
                caVar.f45128r.invalidate();
                caVar.f45089e0.invalidate();
                return;
        }
    }
}
