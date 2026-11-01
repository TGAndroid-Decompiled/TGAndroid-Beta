package lg;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class m implements Runnable {
    public final int f11909a;
    public final q f11910b;

    public m(q qVar, int i10) {
        this.f11909a = i10;
        this.f11910b = qVar;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        switch (this.f11909a) {
            case 0:
                q qVar = this.f11910b;
                AnimatorSet animatorSet = qVar.f11924d0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = qVar.f11923c0) != null && valueAnimator.isRunning())) {
                    qVar.j(qVar.L);
                    return;
                } else {
                    qVar.n();
                    return;
                }
            default:
                this.f11910b.l();
                return;
        }
    }
}
