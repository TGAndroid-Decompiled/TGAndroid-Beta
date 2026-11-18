package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.tv;
public final class o implements Runnable {
    public final int f12318a;
    public final p f12319b;

    public o(p pVar, int i7) {
        this.f12318a = i7;
        this.f12319b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f12318a) {
            case 0:
                tv tvVar = this.f12319b.f12360c0;
                ValueAnimator valueAnimator = tvVar.f12427k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tvVar.f12428l0 = null;
                return;
            default:
                p pVar = this.f12319b;
                pVar.f12367x = false;
                pVar.invalidate();
                return;
        }
    }
}
