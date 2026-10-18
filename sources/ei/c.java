package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f8803a;
    public final d f8804b;

    public c(d dVar, int i10) {
        this.f8803a = i10;
        this.f8804b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8803a) {
            case 0:
                d dVar = this.f8804b;
                dVar.J = false;
                dVar.e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f8804b;
                dVar2.P = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
