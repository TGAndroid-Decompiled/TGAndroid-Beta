package mh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.n50;
public final class k5 extends AnimatorListenerAdapter {
    public final int f14351a;
    public final float f14352b;
    public final Runnable f14353c;
    public final Object d;

    public k5(Object obj, float f10, Runnable runnable, int i10) {
        this.f14351a = i10;
        this.d = obj;
        this.f14352b = f10;
        this.f14353c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f14351a;
        Runnable runnable = this.f14353c;
        float f10 = this.f14352b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l5 l5Var = (l5) obj;
                l5Var.f14394y = f10;
                l5Var.invalidate();
                if (animator == l5Var.B && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                oh.r1 r1Var = (oh.r1) obj;
                r1Var.f17682n = f10;
                r1Var.invalidate();
                if (animator == r1Var.f17683r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                n50 n50Var = (n50) obj;
                n50Var.h = f10;
                n50Var.f39183a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                qh.c2 c2Var = (qh.c2) obj;
                c2Var.h = f10;
                c2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                qh.ba baVar = (qh.ba) obj;
                baVar.I = null;
                baVar.F = f10;
                baVar.k();
                baVar.f45094r.invalidate();
                baVar.f45081n.invalidate();
                runnable.run();
                baVar.M.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                baVar.o();
                Runnable runnable2 = baVar.N;
                if (runnable2 != null) {
                    runnable2.run();
                    baVar.N = null;
                }
                baVar.f45094r.invalidate();
                baVar.f45055e0.invalidate();
                return;
        }
    }
}
