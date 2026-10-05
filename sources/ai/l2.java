package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class l2 extends AnimatorListenerAdapter {
    public final int f1270a;

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f1270a) {
            case 1:
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override
    public void onAnimationEnd(Animator animator, boolean z10) {
        View view;
        switch (this.f1270a) {
            case 0:
                pf.e eVar = m2.Z.L;
                if (eVar == null || (view = eVar.f44431j) == null) {
                    return;
                }
                eVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
