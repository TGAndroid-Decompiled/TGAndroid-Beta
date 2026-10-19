package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.a50;
public final class o7 extends AnimatorListenerAdapter {
    public final int f1949a;
    public final float f1950b;
    public final Runnable f1951c;
    public final Object d;

    public o7(Object obj, float f7, Runnable runnable, int i10) {
        this.f1949a = i10;
        this.d = obj;
        this.f1950b = f7;
        this.f1951c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f1949a;
        Runnable runnable = this.f1951c;
        float f7 = this.f1950b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                p7 p7Var = (p7) obj;
                p7Var.f2022y = f7;
                p7Var.invalidate();
                if (animator == p7Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ci.x1 x1Var = (ci.x1) obj;
                x1Var.f6152n = f7;
                x1Var.invalidate();
                if (animator == x1Var.f6153r && runnable != null) {
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
                vbVar.f10002r.invalidate();
                vbVar.f9989n.invalidate();
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
                vbVar.f10002r.invalidate();
                vbVar.f9973h0.invalidate();
                return;
            default:
                a50 a50Var = (a50) obj;
                a50Var.h = f7;
                a50Var.f35265a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
