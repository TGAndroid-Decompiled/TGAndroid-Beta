package ag;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class g implements Runnable {
    public final int f198a;
    public final j f199b;

    public g(j jVar, int i9) {
        this.f198a = i9;
        this.f199b = jVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f198a) {
            case 0:
                j jVar = this.f199b;
                AnimatorSet animatorSet = jVar.P;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = jVar.O) != null && valueAnimator.isRunning())) {
                    jVar.h(jVar.E);
                    return;
                } else {
                    jVar.k();
                    return;
                }
            default:
                this.f199b.i();
                return;
        }
    }
}
