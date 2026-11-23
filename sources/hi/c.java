package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f14245a;
    public final d f14246b;

    public c(d dVar, int i7) {
        this.f14245a = i7;
        this.f14246b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14245a) {
            case 0:
                d dVar = this.f14246b;
                dVar.N = false;
                dVar.f14302e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f14246b;
                dVar2.U = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
