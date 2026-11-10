package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f11723a;
    public final d f11724b;

    public c(d dVar, int i7) {
        this.f11723a = i7;
        this.f11724b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f11723a) {
            case 0:
                d dVar = this.f11724b;
                dVar.M = false;
                dVar.f11758e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f11724b;
                dVar2.S = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
