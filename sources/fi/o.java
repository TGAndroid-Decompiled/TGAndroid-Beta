package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.tv;
public final class o implements Runnable {
    public final int f12360a;
    public final p f12361b;

    public o(p pVar, int i7) {
        this.f12360a = i7;
        this.f12361b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f12360a) {
            case 0:
                tv tvVar = this.f12361b.f12402c0;
                ValueAnimator valueAnimator = tvVar.f12467k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tvVar.f12468l0 = null;
                return;
            default:
                p pVar = this.f12361b;
                pVar.f12409x = false;
                pVar.invalidate();
                return;
        }
    }
}
