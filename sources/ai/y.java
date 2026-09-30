package ai;

import android.animation.ValueAnimator;
import org.telegram.ui.hx;
public final class y implements Runnable {
    public final int f1744a;
    public final a0 f1745b;

    public y(a0 a0Var, int i10) {
        this.f1744a = i10;
        this.f1745b = a0Var;
    }

    @Override
    public final void run() {
        switch (this.f1744a) {
            case 0:
                hx hxVar = this.f1745b.f495b0;
                ValueAnimator valueAnimator = hxVar.f557j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                hxVar.f558k0 = null;
                return;
            default:
                a0 a0Var = this.f1745b;
                a0Var.f501w = false;
                a0Var.invalidate();
                return;
        }
    }
}
