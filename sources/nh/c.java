package nh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f17451a;
    public final d f17452b;

    public c(d dVar, int i10) {
        this.f17451a = i10;
        this.f17452b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f17451a) {
            case 0:
                d dVar = this.f17452b;
                dVar.F = false;
                dVar.f17496e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f17452b;
                dVar2.L = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
