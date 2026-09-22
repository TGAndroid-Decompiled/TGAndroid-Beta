package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f4419a;
    public final d f4420b;

    public c(d dVar, int i10) {
        this.f4419a = i10;
        this.f4420b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4419a) {
            case 0:
                d dVar = this.f4420b;
                dVar.J = false;
                dVar.e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f4420b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
