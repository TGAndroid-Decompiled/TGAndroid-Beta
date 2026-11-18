package hi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f14296a;
    public final d f14297b;

    public c(d dVar, int i7) {
        this.f14296a = i7;
        this.f14297b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14296a) {
            case 0:
                d dVar = this.f14297b;
                dVar.N = false;
                dVar.f14338e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f14297b;
                dVar2.U = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
