package di;

import android.animation.ValueAnimator;
import org.telegram.ui.pv;
public final class o implements Runnable {
    public final int f9438a;
    public final p f9439b;

    public o(p pVar, int i7) {
        this.f9438a = i7;
        this.f9439b = pVar;
    }

    @Override
    public final void run() {
        switch (this.f9438a) {
            case 0:
                pv pvVar = this.f9439b.f9485b0;
                ValueAnimator valueAnimator = pvVar.f9599j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                pvVar.f9600k0 = null;
                return;
            default:
                p pVar = this.f9439b;
                pVar.f9493x = false;
                pVar.invalidate();
                return;
        }
    }
}
