package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m1 extends AnimatorListenerAdapter {
    public final int f10629a;

    public m1(int i3) {
        this.f10629a = i3;
    }

    @Override
    public void onAnimationEnd(Animator animator) {
        switch (this.f10629a) {
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
        switch (this.f10629a) {
            case 0:
                uf.d dVar = n1.f10647a0.M;
                if (dVar == null || (view = dVar.f55856j) == null) {
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
