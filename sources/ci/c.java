package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f4807a;
    public final d f4808b;

    public c(d dVar, int i10) {
        this.f4807a = i10;
        this.f4808b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4807a) {
            case 0:
                d dVar = this.f4808b;
                dVar.J = false;
                dVar.f4867e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f4808b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
