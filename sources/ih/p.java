package ih;

import android.animation.ValueAnimator;
import org.telegram.ui.vw;
public final class p implements Runnable {
    public final int f11919a;
    public final q f11920b;

    public p(q qVar, int i9) {
        this.f11919a = i9;
        this.f11920b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f11919a) {
            case 0:
                vw vwVar = this.f11920b.U;
                ValueAnimator valueAnimator = vwVar.f12028f0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                vwVar.f12029g0 = null;
                return;
            default:
                q qVar = this.f11920b;
                qVar.f11987w = false;
                qVar.invalidate();
                return;
        }
    }
}
