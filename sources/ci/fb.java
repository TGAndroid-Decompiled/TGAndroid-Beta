package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fb implements Runnable {
    public final int f5106a = 1;
    public final gb f5107b;
    public final Runnable f5108c;
    public final boolean d;

    public fb(gb gbVar, Runnable runnable, boolean z10) {
        this.f5107b = gbVar;
        this.f5108c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f5106a) {
            case 0:
                boolean z10 = this.d;
                this.f5107b.g(this.f5108c, z10);
                return;
            default:
                this.f5108c.run();
                lc lcVar = this.f5107b.f5132a;
                a4 a4Var = lcVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                a4Var.f4719a.t(LocaleController.getString(i10), false, true);
                a4Var.invalidate();
                lcVar.g(true, true);
                lcVar.c0(true);
                lcVar.I0.a(false, true);
                lcVar.J0.b(true, true);
                lcVar.h0(true, true);
                return;
        }
    }

    public fb(gb gbVar, boolean z10, Runnable runnable) {
        this.f5107b = gbVar;
        this.d = z10;
        this.f5108c = runnable;
    }
}
