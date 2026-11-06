package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f11718a;
    public final d f11719b;

    public c(d dVar, int i7) {
        this.f11718a = i7;
        this.f11719b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11718a) {
            case 0:
                d dVar = this.f11719b;
                dVar.M = false;
                dVar.f11754e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f11719b;
                dVar2.S = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
