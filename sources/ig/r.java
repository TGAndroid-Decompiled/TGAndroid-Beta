package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import jh.i1;
import org.telegram.messenger.NotificationCenter;

public final class r extends AnimatorListenerAdapter {

    public final int f11414a;

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f11414a) {
            case 1:
                ye.d dVar = i1.V.H;
                if (dVar != null && (view = dVar.f49867j) != null) {
                    dVar.e(view);
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator, z10);
                break;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f11414a) {
            case 0:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                break;
        }
    }

    private final void a(Animator animator) {
    }
}
