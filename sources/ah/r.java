package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import org.telegram.messenger.NotificationCenter;
public final class r extends AnimatorListenerAdapter {
    public final int f663a;
    public final b0 f664b;

    public r(b0 b0Var, int i10) {
        this.f663a = i10;
        this.f664b = b0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f663a;
        b0 b0Var = this.f664b;
        switch (i10) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                b0Var.f445c.setVisibility(4);
                if (Build.MODEL.toLowerCase().startsWith("zte") && Build.VERSION.SDK_INT <= 28) {
                    b0Var.f447f.setFocusableInTouchMode(false);
                    return;
                }
                return;
            case 1:
                b0Var.f448n.setFocusableInTouchMode(true);
                return;
            case 2:
                b0Var.f451w.setVisibility(4);
                return;
            default:
                b0Var.f448n.setFocusableInTouchMode(false);
                b0Var.f447f.setVisibility(4);
                return;
        }
    }
}
