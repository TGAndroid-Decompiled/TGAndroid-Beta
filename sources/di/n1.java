package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n1 extends AnimatorListenerAdapter {
    public final int f8811a;

    public n1(int i10) {
        this.f8811a = i10;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f8811a) {
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
        switch (this.f8811a) {
            case 0:
                sf.d dVar = o1.Z.L;
                if (dVar == null || (view = dVar.f48131j) == null) {
                    return;
                }
                dVar.e(view);
                return;
            default:
                super.onAnimationEnd(animator, z10);
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
