package lh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class c extends AnimatorListenerAdapter {

    public final int f15715a;

    public final d f15716b;

    public c(d dVar, int i10) {
        this.f15715a = i10;
        this.f15716b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15715a) {
            case 0:
                d dVar = this.f15716b;
                dVar.F = false;
                dVar.f15827e.q(null, false, true);
                break;
            default:
                d dVar2 = this.f15716b;
                dVar2.L = 1.0f;
                dVar2.invalidate();
                break;
        }
    }
}
