package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f13953a;
    public final d f13954b;

    public c(d dVar, int i7) {
        this.f13953a = i7;
        this.f13954b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13953a) {
            case 0:
                d dVar = this.f13954b;
                dVar.N = false;
                dVar.f14057e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f13954b;
                dVar2.T = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
