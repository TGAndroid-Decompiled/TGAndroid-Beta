package fg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class f implements Runnable {
    public final int f6149a;
    public final i f6150b;

    public f(i iVar, int i10) {
        this.f6149a = i10;
        this.f6150b = iVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f6149a) {
            case 0:
                i iVar = this.f6150b;
                AnimatorSet animatorSet = iVar.Q;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = iVar.P) != null && valueAnimator.isRunning())) {
                    iVar.h(iVar.F);
                    return;
                } else {
                    iVar.k();
                    return;
                }
            default:
                this.f6150b.i();
                return;
        }
    }
}
