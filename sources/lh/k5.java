package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.m50;
public final class k5 extends AnimatorListenerAdapter {
    public final int f12719a;
    public final float f12720b;
    public final Runnable f12721c;
    public final Object d;

    public k5(Object obj, float f10, Runnable runnable, int i10) {
        this.f12719a = i10;
        this.d = obj;
        this.f12720b = f10;
        this.f12721c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f12719a;
        Runnable runnable = this.f12721c;
        float f10 = this.f12720b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l5 l5Var = (l5) obj;
                l5Var.f12760y = f10;
                l5Var.invalidate();
                if (animator == l5Var.B && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                nh.r1 r1Var = (nh.r1) obj;
                r1Var.f15829n = f10;
                r1Var.invalidate();
                if (animator == r1Var.f15830r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                m50 m50Var = (m50) obj;
                m50Var.h = f10;
                m50Var.f36190a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                ph.d2 d2Var = (ph.d2) obj;
                d2Var.h = f10;
                d2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                ph.da daVar = (ph.da) obj;
                daVar.I = null;
                daVar.F = f10;
                daVar.k();
                daVar.f41525r.invalidate();
                daVar.f41512n.invalidate();
                runnable.run();
                daVar.M.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                daVar.o();
                Runnable runnable2 = daVar.N;
                if (runnable2 != null) {
                    runnable2.run();
                    daVar.N = null;
                }
                daVar.f41525r.invalidate();
                daVar.f41486e0.invalidate();
                return;
        }
    }
}
