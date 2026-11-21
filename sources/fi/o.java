package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.tv;
public final class o implements Runnable {
    public final int f12357a;
    public final p f12358b;

    public o(p pVar, int i7) {
        this.f12357a = i7;
        this.f12358b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f12357a) {
            case 0:
                tv tvVar = this.f12358b.f12399c0;
                ValueAnimator valueAnimator = tvVar.f12464k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                tvVar.f12465l0 = null;
                return;
            default:
                p pVar = this.f12358b;
                pVar.f12406x = false;
                pVar.invalidate();
                return;
        }
    }
}
