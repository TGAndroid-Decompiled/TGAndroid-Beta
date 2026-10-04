package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class eb implements Runnable {
    public final int f5059a = 1;
    public final fb f5060b;
    public final Runnable f5061c;
    public final boolean d;

    public eb(fb fbVar, Runnable runnable, boolean z10) {
        this.f5060b = fbVar;
        this.f5061c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f5059a) {
            case 0:
                boolean z10 = this.d;
                this.f5060b.f(this.f5061c, z10);
                return;
            default:
                this.f5061c.run();
                kc kcVar = this.f5060b.f5089a;
                b4 b4Var = kcVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                b4Var.f4734a.q(LocaleController.getString(i10), false, true);
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
        this.f5060b = fbVar;
        this.d = z10;
        this.f5061c = runnable;
    }
}
