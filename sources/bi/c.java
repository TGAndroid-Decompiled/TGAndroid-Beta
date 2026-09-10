package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f2390a;
    public final d f2391b;

    public c(d dVar, int i10) {
        this.f2390a = i10;
        this.f2391b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f2390a) {
            case 0:
                d dVar = this.f2391b;
                dVar.J = false;
                dVar.e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f2391b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
