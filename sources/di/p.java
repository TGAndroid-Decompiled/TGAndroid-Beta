package di;

import android.animation.ValueAnimator;
import org.telegram.ui.sw;
public final class p implements Runnable {
    public final int f8892a;
    public final q f8893b;

    public p(q qVar, int i10) {
        this.f8892a = i10;
        this.f8893b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f8892a) {
            case 0:
                sw swVar = this.f8893b.f8937b0;
                ValueAnimator valueAnimator = swVar.f9083j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                swVar.f9084k0 = null;
                return;
            default:
                q qVar = this.f8893b;
                qVar.f8943w = false;
                qVar.invalidate();
                return;
        }
    }
}
