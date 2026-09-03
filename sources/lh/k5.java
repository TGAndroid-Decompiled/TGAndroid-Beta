package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.o50;
public final class k5 extends AnimatorListenerAdapter {
    public final int f12703a;
    public final float f12704b;
    public final Runnable f12705c;
    public final Object d;

    public k5(Object obj, float f10, Runnable runnable, int i10) {
        this.f12703a = i10;
        this.d = obj;
        this.f12704b = f10;
        this.f12705c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f12703a;
        Runnable runnable = this.f12705c;
        float f10 = this.f12704b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                l5 l5Var = (l5) obj;
                l5Var.f12744y = f10;
                l5Var.invalidate();
                if (animator == l5Var.B && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                nh.r1 r1Var = (nh.r1) obj;
                r1Var.f15809n = f10;
                r1Var.invalidate();
                if (animator == r1Var.f15810r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                o50 o50Var = (o50) obj;
                o50Var.h = f10;
                o50Var.f36650a.invalidate();
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
                daVar.f41563r.invalidate();
                daVar.f41550n.invalidate();
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
                daVar.f41563r.invalidate();
                daVar.f41524e0.invalidate();
                return;
        }
    }
}
