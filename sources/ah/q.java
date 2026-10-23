package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class q extends AnimatorListenerAdapter {
    public final int f848a;
    public final a0 f849b;

    public q(a0 a0Var, int i10) {
        this.f848a = i10;
        this.f849b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f848a;
        a0 a0Var = this.f849b;
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
