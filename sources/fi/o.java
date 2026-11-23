package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.tv;
public final class o implements Runnable {
    public final int f12310a;
    public final p f12311b;

    public o(p pVar, int i7) {
        this.f12310a = i7;
        this.f12311b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f12310a) {
            case 0:
                tv tvVar = this.f12311b.f12352c0;
                ValueAnimator valueAnimator = tvVar.f12419k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tvVar.f12420l0 = null;
                return;
            default:
                p pVar = this.f12311b;
                pVar.f12359x = false;
                pVar.invalidate();
                return;
        }
    }
}
