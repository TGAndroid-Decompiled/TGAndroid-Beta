package di;

import android.animation.ValueAnimator;
import org.telegram.ui.qw;
public final class p implements Runnable {
    public final int f8893a;
    public final q f8894b;

    public p(q qVar, int i10) {
        this.f8893a = i10;
        this.f8894b = qVar;
    }

    @Override
    public final void run() {
        switch (this.f8893a) {
            case 0:
                qw qwVar = this.f8894b.f8938b0;
                ValueAnimator valueAnimator = qwVar.f9084j0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                qwVar.f9085k0 = null;
                return;
            default:
                q qVar = this.f8894b;
                qVar.f8944w = false;
                qVar.invalidate();
                return;
        }
    }
}
