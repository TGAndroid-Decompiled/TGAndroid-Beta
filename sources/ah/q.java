package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class q extends AnimatorListenerAdapter {
    public final int f843a;
    public final a0 f844b;

    public q(a0 a0Var, int i10) {
        this.f843a = i10;
        this.f844b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f843a;
        a0 a0Var = this.f844b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                a0Var.f637c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    a0Var.f638f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                a0Var.f639n.setFocusableInTouchMode(true);
                return;
            case 2:
                a0Var.f642w.setVisibility(4);
                return;
            default:
                a0Var.f639n.setFocusableInTouchMode(false);
                a0Var.f638f.setVisibility(4);
                return;
        }
    }
}
