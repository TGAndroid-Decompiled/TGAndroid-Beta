package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f4421a;
    public final d f4422b;

    public c(d dVar, int i10) {
        this.f4421a = i10;
        this.f4422b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4421a) {
            case 0:
                d dVar = this.f4422b;
                dVar.J = false;
                dVar.e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f4422b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
