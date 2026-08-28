package gh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kh.wb;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.y40;
public final class o5 extends AnimatorListenerAdapter {
    public final int f8684a;
    public final float f8685b;
    public final Runnable f8686c;
    public final Object d;

    public o5(Object obj, float f10, Runnable runnable, int i9) {
        this.f8684a = i9;
        this.d = obj;
        this.f8685b = f10;
        this.f8686c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9 = this.f8684a;
        Runnable runnable = this.f8686c;
        float f10 = this.f8685b;
        Object obj = this.d;
        switch (i9) {
            case 0:
                p5 p5Var = (p5) obj;
                p5Var.f8723y = f10;
                p5Var.invalidate();
                if (animator == p5Var.A && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ih.s1 s1Var = (ih.s1) obj;
                s1Var.f12105n = f10;
                s1Var.invalidate();
                if (animator == s1Var.f12106r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                kh.s2 s2Var = (kh.s2) obj;
                s2Var.h = f10;
                s2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                wb wbVar = (wb) obj;
                wbVar.H = null;
                wbVar.E = f10;
                wbVar.k();
                wbVar.f16300r.invalidate();
                wbVar.f16287n.invalidate();
                runnable.run();
                wbVar.L.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                wbVar.o();
                Runnable runnable2 = wbVar.M;
                if (runnable2 != null) {
                    runnable2.run();
                    wbVar.M = null;
                }
                wbVar.f16300r.invalidate();
                wbVar.f16257d0.invalidate();
                return;
            default:
                y40 y40Var = (y40) obj;
                y40Var.h = f10;
                y40Var.f44717a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
