package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.lx;
public final class y implements Runnable {
    public final int f1742a;
    public final a0 f1743b;

    public y(a0 a0Var, int i10) {
        this.f1742a = i10;
        this.f1743b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f1742a) {
            case 0:
                lx lxVar = this.f1743b.f498b0;
                ValueAnimator valueAnimator = lxVar.f553j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                lxVar.f554k0 = null;
                return;
            default:
                a0 a0Var = this.f1743b;
                a0Var.f504w = false;
                a0Var.invalidate();
                return;
        }
    }
}
