package fi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f10588a;
    public final d f10589b;

    public c(d dVar, int i10) {
        this.f10588a = i10;
        this.f10589b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10588a) {
            case 0:
                d dVar = this.f10589b;
                dVar.M = false;
                dVar.e.t(null, false, true);
                return;
            default:
                d dVar2 = this.f10589b;
                dVar2.S = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
