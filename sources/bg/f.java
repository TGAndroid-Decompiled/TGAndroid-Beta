package bg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

public final class f implements Runnable {

    public final int f2122a;

    public final i f2123b;

    public f(i iVar, int i10) {
        this.f2122a = i10;
        this.f2123b = iVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f2122a) {
            case 0:
                i iVar = this.f2123b;
                AnimatorSet animatorSet = iVar.P;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = iVar.O) != null && valueAnimator.isRunning())) {
                    iVar.h(iVar.E);
                } else {
                    iVar.k();
                }
                break;
            default:
                this.f2123b.i();
                break;
        }
    }
}
