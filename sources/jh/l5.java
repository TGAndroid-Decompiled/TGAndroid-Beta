package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import nh.gb;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.a50;
public final class l5 extends AnimatorListenerAdapter {
    public final int f12429a;
    public final float f12430b;
    public final Runnable f12431c;
    public final Object d;

    public l5(Object obj, float f9, Runnable runnable, int i10) {
        this.f12429a = i10;
        this.d = obj;
        this.f12430b = f9;
        this.f12431c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f12429a;
        Runnable runnable = this.f12431c;
        float f9 = this.f12430b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                m5 m5Var = (m5) obj;
                m5Var.f12464y = f9;
                m5Var.invalidate();
                if (animator == m5Var.A && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                lh.q1 q1Var = (lh.q1) obj;
                q1Var.f16114n = f9;
                q1Var.invalidate();
                if (animator == q1Var.f16115r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 2:
                nh.p2 p2Var = (nh.p2) obj;
                p2Var.h = f9;
                p2Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                gb gbVar = (gb) obj;
                gbVar.H = null;
                gbVar.E = f9;
                gbVar.k();
                gbVar.f17790r.invalidate();
                gbVar.f17777n.invalidate();
                runnable.run();
                gbVar.L.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                gbVar.o();
                Runnable runnable2 = gbVar.M;
                if (runnable2 != null) {
                    runnable2.run();
                    gbVar.M = null;
                }
                gbVar.f17790r.invalidate();
                gbVar.f17747d0.invalidate();
                return;
            default:
                a50 a50Var = (a50) obj;
                a50Var.h = f9;
                a50Var.f36428a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
