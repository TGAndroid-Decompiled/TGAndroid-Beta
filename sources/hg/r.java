package hg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ih.k1;
import org.telegram.messenger.NotificationCenter;
public final class r extends AnimatorListenerAdapter {
    public final int f10712a;

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f10712a) {
            case 1:
                xe.d dVar = k1.V.H;
                if (dVar == null || (view = dVar.f49151j) == null) {
                    return;
                }
                dVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f10712a) {
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
