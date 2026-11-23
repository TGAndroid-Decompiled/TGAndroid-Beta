package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.sv;
public final class o implements Runnable {
    public final int f12322a;
    public final p f12323b;

    public o(p pVar, int i7) {
        this.f12322a = i7;
        this.f12323b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f12322a) {
            case 0:
                sv svVar = this.f12323b.f12364c0;
                ValueAnimator valueAnimator = svVar.f12429k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                svVar.f12430l0 = null;
                return;
            default:
                p pVar = this.f12323b;
                pVar.f12371x = false;
                pVar.invalidate();
                return;
        }
    }
}
