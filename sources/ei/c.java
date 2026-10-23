package ei;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f8811a;
    public final d f8812b;

    public c(d dVar, int i10) {
        this.f8811a = i10;
        this.f8812b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8811a) {
            case 0:
                d dVar = this.f8812b;
                dVar.M = false;
                dVar.e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f8812b;
                dVar2.S = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
