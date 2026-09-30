package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class fb implements Runnable {
    public final int f4716a = 1;
    public final gb f4717b;
    public final Runnable f4718c;
    public final boolean d;

    public fb(gb gbVar, Runnable runnable, boolean z10) {
        this.f4717b = gbVar;
        this.f4718c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f4716a) {
            case 0:
                boolean z10 = this.d;
                this.f4717b.f(this.f4718c, z10);
                return;
            default:
                this.f4718c.run();
                lc lcVar = this.f4717b.f4742a;
                b4 b4Var = lcVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                b4Var.f4381a.q(LocaleController.getString(i10), false, true);
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
        this.f4717b = gbVar;
        this.d = z10;
        this.f4718c = runnable;
    }
}
