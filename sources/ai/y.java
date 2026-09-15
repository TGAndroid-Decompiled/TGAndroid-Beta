package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.lx;
public final class y implements Runnable {
    public final int f1737a;
    public final a0 f1738b;

    public y(a0 a0Var, int i10) {
        this.f1737a = i10;
        this.f1738b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f1737a) {
            case 0:
                lx lxVar = this.f1738b.f493b0;
                ValueAnimator valueAnimator = lxVar.f548j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                lxVar.f549k0 = null;
                return;
            default:
                a0 a0Var = this.f1738b;
                a0Var.f499w = false;
                a0Var.invalidate();
                return;
        }
    }
}
