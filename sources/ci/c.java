package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f4794a;
    public final d f4795b;

    public c(d dVar, int i10) {
        this.f4794a = i10;
        this.f4795b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4794a) {
            case 0:
                d dVar = this.f4795b;
                dVar.J = false;
                dVar.f4858e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f4795b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
