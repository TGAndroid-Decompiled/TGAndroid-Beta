package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.s50;
public final class j3 extends AnimatorListenerAdapter {
    public final int f2938a;
    public final float f2939b;
    public final Runnable f2940c;
    public final Object d;

    public j3(Object obj, float f7, Runnable runnable, int i10) {
        this.f2938a = i10;
        this.d = obj;
        this.f2939b = f7;
        this.f2940c = runnable;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f2938a;
        Runnable runnable = this.f2940c;
        float f7 = this.f2939b;
        Object obj = this.d;
        switch (i10) {
            case 0:
                m3 m3Var = (m3) obj;
                m3Var.h = f7;
                m3Var.i();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                ce ceVar = (ce) obj;
                ceVar.L = null;
                ceVar.I = f7;
                ceVar.k();
                ceVar.f2483r.invalidate();
                ceVar.f2470n.invalidate();
                runnable.run();
                ceVar.P.unlock();
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                NotificationCenter.getGlobalInstance().runDelayedNotifications();
                ceVar.o();
                Runnable runnable2 = ceVar.Q;
                if (runnable2 != null) {
                    runnable2.run();
                    ceVar.Q = null;
                }
                ceVar.f2483r.invalidate();
                ceVar.f2454h0.invalidate();
                return;
            case 2:
                s50 s50Var = (s50) obj;
                s50Var.h = f7;
                s50Var.f36550a.invalidate();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 3:
                xh.b4 b4Var = (xh.b4) obj;
                b4Var.f45275y = f7;
                b4Var.invalidate();
                if (animator == b4Var.E && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                zh.e1 e1Var = (zh.e1) obj;
                e1Var.f48365n = f7;
                e1Var.invalidate();
                if (animator == e1Var.f48366r && runnable != null) {
                    runnable.run();
                    return;
                }
                return;
        }
    }
}
