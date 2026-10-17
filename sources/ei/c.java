package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f8804a;
    public final d f8805b;

    public c(d dVar, int i10) {
        this.f8804a = i10;
        this.f8805b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8804a) {
            case 0:
                d dVar = this.f8805b;
                dVar.J = false;
                dVar.e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f8805b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
