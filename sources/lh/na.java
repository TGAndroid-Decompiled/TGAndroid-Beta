package lh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class na implements Runnable {

    public final int f16451a = 1;

    public final oa f16452b;

    public final Runnable f16453c;
    public final boolean d;

    public na(oa oaVar, Runnable runnable, boolean z10) {
        this.f16452b = oaVar;
        this.f16453c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        switch (this.f16451a) {
            case 0:
                this.f16452b.f(this.f16453c, this.d);
                break;
            default:
                this.f16453c.run();
                sb sbVar = this.f16452b.f16494a;
                u3 u3Var = sbVar.P0;
                u3Var.f16902a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                u3Var.invalidate();
                sbVar.h(true, true);
                sbVar.d0(true);
                sbVar.E0.a(false, true);
                sbVar.F0.b(true, true);
                sbVar.i0(true, true);
                break;
        }
    }

    public na(oa oaVar, boolean z10, Runnable runnable) {
        this.f16452b = oaVar;
        this.d = z10;
        this.f16453c = runnable;
    }
}
