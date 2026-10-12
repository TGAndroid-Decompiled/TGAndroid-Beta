package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import bi.b2;
import org.telegram.messenger.NotificationCenter;
public final class z extends AnimatorListenerAdapter {
    public final int f911a;

    public z(int i10) {
        this.f911a = i10;
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f911a) {
            case 1:
                rf.d dVar = b2.Z.L;
                if (dVar == null || (view = dVar.f44180j) == null) {
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
        switch (this.f911a) {
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
