package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fb implements Runnable {
    public final int f4708a = 1;
    public final gb f4709b;
    public final Runnable f4710c;
    public final boolean d;

    public fb(gb gbVar, Runnable runnable, boolean z10) {
        this.f4709b = gbVar;
        this.f4710c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f4708a) {
            case 0:
                boolean z10 = this.d;
                this.f4709b.f(this.f4710c, z10);
                return;
            default:
                this.f4710c.run();
                lc lcVar = this.f4709b.f4734a;
                b4 b4Var = lcVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                b4Var.f4374a.q(LocaleController.getString(i10), false, true);
                b4Var.invalidate();
                lcVar.h(true, true);
                lcVar.d0(true);
                lcVar.I0.a(false, true);
                lcVar.J0.b(true, true);
                lcVar.i0(true, true);
                return;
        }
    }

    public fb(gb gbVar, boolean z10, Runnable runnable) {
        this.f4709b = gbVar;
        this.d = z10;
        this.f4710c = runnable;
    }
}
