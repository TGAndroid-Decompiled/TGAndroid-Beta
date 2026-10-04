package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f4793a;
    public final d f4794b;

    public c(d dVar, int i10) {
        this.f4793a = i10;
        this.f4794b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4793a) {
            case 0:
                d dVar = this.f4794b;
                dVar.J = false;
                dVar.f4857e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f4794b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
