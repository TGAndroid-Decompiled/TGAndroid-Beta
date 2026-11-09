package di;

import android.animation.ValueAnimator;
import org.telegram.ui.rv;
public final class o implements Runnable {
    public final int f9416a;
    public final p f9417b;

    public o(p pVar, int i7) {
        this.f9416a = i7;
        this.f9417b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f9416a) {
            case 0:
                rv rvVar = this.f9417b.f9474b0;
                ValueAnimator valueAnimator = rvVar.f9540j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                rvVar.f9541k0 = null;
                return;
            default:
                p pVar = this.f9417b;
                pVar.f9482x = false;
                pVar.invalidate();
                return;
        }
    }
}
