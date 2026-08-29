package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import lh.i1;
import org.telegram.messenger.NotificationCenter;
public final class r extends AnimatorListenerAdapter {
    public final int f13827a;

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f13827a) {
            case 1:
                af.g gVar = i1.V.H;
                if (gVar == null || (view = gVar.f404j) == null) {
                    return;
                }
                gVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f13827a) {
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
