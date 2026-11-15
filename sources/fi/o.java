package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.qv;
public final class o implements Runnable {
    public final int f12096a;
    public final p f12097b;

    public o(p pVar, int i7) {
        this.f12096a = i7;
        this.f12097b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f12096a) {
            case 0:
                qv qvVar = this.f12097b.f12148c0;
                ValueAnimator valueAnimator = qvVar.f12199k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                qvVar.f12200l0 = null;
                return;
            default:
                p pVar = this.f12097b;
                pVar.f12155x = false;
                pVar.invalidate();
                return;
        }
    }
}
