package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.c50;
public final class o7 extends AnimatorListenerAdapter {
    public final int f1959a;
    public final float f1960b;
    public final Runnable f1961c;
    public final Object d;

    public o7(Object obj, float f7, Runnable runnable, int i10) {
        this.f1959a = i10;
        this.d = obj;
        this.f1960b = f7;
        this.f1961c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f1959a;
        Runnable runnable = this.f1961c;
        float f7 = this.f1960b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                p7 p7Var = (p7) obj;
                p7Var.f2024y = f7;
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
                vbVar.f10001r.invalidate();
                vbVar.f9988n.invalidate();
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
                vbVar.f10001r.invalidate();
                vbVar.f9972h0.invalidate();
                return;
            default:
                c50 c50Var = (c50) obj;
                c50Var.h = f7;
                c50Var.f35821a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
