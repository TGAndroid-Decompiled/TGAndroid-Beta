package kh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final int f15022a;
    public final d f15023b;

    public c(d dVar, int i9) {
        this.f15022a = i9;
        this.f15023b = dVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15022a) {
            case 0:
                d dVar = this.f15023b;
                dVar.F = false;
                dVar.f15069e.q(null, false, true);
                return;
            default:
                d dVar2 = this.f15023b;
                dVar2.L = 1.0f;
                dVar2.invalidate();
                return;
        }
    }
}
