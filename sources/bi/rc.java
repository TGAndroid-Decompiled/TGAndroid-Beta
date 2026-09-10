package bi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rc implements Runnable {
    public final int f3626a = 1;
    public final sc f3627b;
    public final Runnable f3628c;
    public final boolean d;

    public rc(sc scVar, Runnable runnable, boolean z10) {
        this.f3627b = scVar;
        this.f3628c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f3626a) {
            case 0:
                boolean z10 = this.d;
                this.f3627b.f(this.f3628c, z10);
                return;
            default:
                this.f3628c.run();
                ce ceVar = this.f3627b.f3660a;
                u4 u4Var = ceVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                u4Var.f3715a.q(LocaleController.getString(i10), false, true);
                u4Var.invalidate();
                ceVar.h(true, true);
                ceVar.d0(true);
                ceVar.I0.a(false, true);
                ceVar.J0.b(true, true);
                ceVar.i0(true, true);
                return;
        }
    }

    public rc(sc scVar, boolean z10, Runnable runnable) {
        this.f3627b = scVar;
        this.d = z10;
        this.f3628c = runnable;
    }
}
