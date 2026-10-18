package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.vw;
public final class p implements Runnable {
    public final int f5638a;
    public final q f5639b;

    public p(q qVar, int i10) {
        this.f5638a = i10;
        this.f5639b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f5638a) {
            case 0:
                vw vwVar = this.f5639b.f5752b0;
                ValueAnimator valueAnimator = vwVar.f5820j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                vwVar.f5821k0 = null;
                return;
            default:
                q qVar = this.f5639b;
                qVar.f5758w = false;
                qVar.invalidate();
                return;
        }
    }
}
