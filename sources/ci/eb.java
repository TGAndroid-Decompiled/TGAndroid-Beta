package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class eb implements Runnable {
    public final int f5060a = 1;
    public final fb f5061b;
    public final Runnable f5062c;
    public final boolean d;

    public eb(fb fbVar, Runnable runnable, boolean z10) {
        this.f5061b = fbVar;
        this.f5062c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f5060a) {
            case 0:
                boolean z10 = this.d;
                this.f5061b.f(this.f5062c, z10);
                return;
            default:
                this.f5062c.run();
                kc kcVar = this.f5061b.f5090a;
                b4 b4Var = kcVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                b4Var.f4735a.q(LocaleController.getString(i10), false, true);
                b4Var.invalidate();
                kcVar.h(true, true);
                kcVar.d0(true);
                kcVar.I0.a(false, true);
                kcVar.J0.b(true, true);
                kcVar.i0(true, true);
                return;
        }
    }

    public eb(fb fbVar, boolean z10, Runnable runnable) {
        this.f5061b = fbVar;
        this.d = z10;
        this.f5062c = runnable;
    }
}
