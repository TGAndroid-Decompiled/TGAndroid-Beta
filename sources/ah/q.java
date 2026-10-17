package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class q extends AnimatorListenerAdapter {
    public final int f849a;
    public final a0 f850b;

    public q(a0 a0Var, int i10) {
        this.f849a = i10;
        this.f850b = a0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f849a;
        a0 a0Var = this.f850b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                a0Var.f643c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    a0Var.f644f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                a0Var.f645n.setFocusableInTouchMode(true);
                return;
            case 2:
                a0Var.f648w.setVisibility(4);
                return;
            default:
                a0Var.f645n.setFocusableInTouchMode(false);
                a0Var.f644f.setVisibility(4);
                return;
        }
    }
}
