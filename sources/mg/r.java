package mg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import nh.j1;
import org.telegram.messenger.NotificationCenter;
public final class r extends AnimatorListenerAdapter {
    public final int f14109a;

    @Override
    public void onAnimationEnd(Animator animator, boolean z4) {
        View view;
        switch (this.f14109a) {
            case 1:
                cf.f fVar = j1.W.I;
                if (fVar == null || (view = fVar.f2301j) == null) {
                    return;
                }
                fVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z4);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f14109a) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
