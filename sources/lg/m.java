package lg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class m implements Runnable {
    public final int f11908a;
    public final q f11909b;

    public m(q qVar, int i10) {
        this.f11908a = i10;
        this.f11909b = qVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f11908a) {
            case 0:
                q qVar = this.f11909b;
                AnimatorSet animatorSet = qVar.f11923d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = qVar.f11922c0) != null && valueAnimator.isRunning())) {
                    qVar.j(qVar.L);
                    return;
                } else {
                    qVar.n();
                    return;
                }
            default:
                this.f11909b.l();
                return;
        }
    }
}
