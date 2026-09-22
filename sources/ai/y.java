package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.lx;
public final class y implements Runnable {
    public final int f1739a;
    public final a0 f1740b;

    public y(a0 a0Var, int i10) {
        this.f1739a = i10;
        this.f1740b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f1739a) {
            case 0:
                lx lxVar = this.f1740b.f495b0;
                ValueAnimator valueAnimator = lxVar.f550j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                lxVar.f551k0 = null;
                return;
            default:
                a0 a0Var = this.f1740b;
                a0Var.f501w = false;
                a0Var.invalidate();
                return;
        }
    }
}
