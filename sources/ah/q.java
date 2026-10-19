package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class q extends AnimatorListenerAdapter {
    public final int f847a;
    public final a0 f848b;

    public q(a0 a0Var, int i10) {
        this.f847a = i10;
        this.f848b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f847a;
        a0 a0Var = this.f848b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                a0Var.f641c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    a0Var.f642f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                a0Var.f643n.setFocusableInTouchMode(true);
                return;
            case 2:
                a0Var.f646w.setVisibility(4);
                return;
            default:
                a0Var.f643n.setFocusableInTouchMode(false);
                a0Var.f642f.setVisibility(4);
                return;
        }
    }
}
