package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f4806a;
    public final d f4807b;

    public c(d dVar, int i10) {
        this.f4806a = i10;
        this.f4807b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4806a) {
            case 0:
                d dVar = this.f4807b;
                dVar.J = false;
                dVar.f4866e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f4807b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
