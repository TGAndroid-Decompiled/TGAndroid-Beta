package hh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import lh.sb;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.b50;

public final class n5 extends AnimatorListenerAdapter {

    public final int f9783a;

    public final float f9784b;

    public final Runnable f9785c;
    public final Object d;

    public n5(Object obj, float f10, Runnable runnable, int i10) {
        this.f9783a = i10;
        this.d = obj;
        this.f9784b = f10;
        this.f9785c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f9783a;
        Runnable runnable = this.f9785c;
        float f10 = this.f9784b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                o5 o5Var = (o5) obj;
                o5Var.f9836y = f10;
                o5Var.invalidate();
                if (animator == o5Var.A && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 1:
                jh.q1 q1Var = (jh.q1) obj;
                q1Var.f13848n = f10;
                q1Var.invalidate();
                if (animator == q1Var.f13849r && runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 2:
                lh.r2 r2Var = (lh.r2) obj;
                r2Var.h = f10;
                r2Var.i();
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 3:
                sb sbVar = (sb) obj;
                sbVar.H = null;
                sbVar.E = f10;
                sbVar.k();
                sbVar.f16796r.invalidate();
                sbVar.f16783n.invalidate();
                runnable.run();
                sbVar.L.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                sbVar.o();
                Runnable runnable2 = sbVar.M;
                if (runnable2 != null) {
                    runnable2.run();
                    sbVar.M = null;
                }
                sbVar.f16796r.invalidate();
                sbVar.f16753d0.invalidate();
                break;
            default:
                b50 b50Var = (b50) obj;
                b50Var.h = f10;
                b50Var.f36699a.invalidate();
                if (runnable != null) {
                    runnable.run();
                }
                break;
        }
    }
}
