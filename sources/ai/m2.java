package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
public final class m2 extends AnimatorListenerAdapter {
    public final int f1386a;

    public m2(int i10) {
        this.f1386a = i10;
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f1386a) {
            case 0:
                qf.e eVar = n2.Z.L;
                if (eVar == null || (view = eVar.f46247j) == null) {
                    return;
                }
                eVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f1386a) {
            case 1:
                return;
            case 2:
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
