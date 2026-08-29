package dg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class f implements Runnable {
    public final int f5583a;
    public final i f5584b;

    public f(i iVar, int i10) {
        this.f5583a = i10;
        this.f5584b = iVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f5583a) {
            case 0:
                i iVar = this.f5584b;
                AnimatorSet animatorSet = iVar.P;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = iVar.O) != null && valueAnimator.isRunning())) {
                    iVar.h(iVar.E);
                    return;
                } else {
                    iVar.k();
                    return;
                }
            default:
                this.f5584b.i();
                return;
        }
    }
}
