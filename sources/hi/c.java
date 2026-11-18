package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f14299a;
    public final d f14300b;

    public c(d dVar, int i7) {
        this.f14299a = i7;
        this.f14300b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14299a) {
            case 0:
                d dVar = this.f14300b;
                dVar.N = false;
                dVar.f14341e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f14300b;
                dVar2.U = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
