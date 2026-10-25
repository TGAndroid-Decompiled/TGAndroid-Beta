package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f10589a;
    public final d f10590b;

    public c(d dVar, int i10) {
        this.f10589a = i10;
        this.f10590b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10589a) {
            case 0:
                d dVar = this.f10590b;
                dVar.M = false;
                dVar.e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f10590b;
                dVar2.S = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
