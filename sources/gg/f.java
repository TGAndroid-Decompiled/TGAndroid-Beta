package gg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class f implements Runnable {
    public final int f7080a;
    public final i f7081b;

    public f(i iVar, int i10) {
        this.f7080a = i10;
        this.f7081b = iVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f7080a) {
            case 0:
                i iVar = this.f7081b;
                AnimatorSet animatorSet = iVar.Q;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = iVar.P) != null && valueAnimator.isRunning())) {
                    iVar.h(iVar.F);
                    return;
                } else {
                    iVar.k();
                    return;
                }
            default:
                this.f7081b.i();
                return;
        }
    }
}
