package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f4417a;
    public final d f4418b;

    public c(d dVar, int i10) {
        this.f4417a = i10;
        this.f4418b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4417a) {
            case 0:
                d dVar = this.f4418b;
                dVar.J = false;
                dVar.e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f4418b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
