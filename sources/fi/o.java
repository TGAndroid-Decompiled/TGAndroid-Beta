package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.tv;
public final class o implements Runnable {
    public final int f12315a;
    public final p f12316b;

    public o(p pVar, int i7) {
        this.f12315a = i7;
        this.f12316b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f12315a) {
            case 0:
                tv tvVar = this.f12316b.f12357c0;
                ValueAnimator valueAnimator = tvVar.f12424k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tvVar.f12425l0 = null;
                return;
            default:
                p pVar = this.f12316b;
                pVar.f12364x = false;
                pVar.invalidate();
                return;
        }
    }
}
