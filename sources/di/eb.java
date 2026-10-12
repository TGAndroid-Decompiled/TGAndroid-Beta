package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class eb implements Runnable {
    public final int f6925a = 1;
    public final fb f6926b;
    public final Runnable f6927c;
    public final boolean d;

    public eb(fb fbVar, Runnable runnable, boolean z10) {
        this.f6926b = fbVar;
        this.f6927c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f6925a) {
            case 0:
                boolean z10 = this.d;
                this.f6926b.g(this.f6927c, z10);
                return;
            default:
                this.f6927c.run();
                kc kcVar = this.f6926b.f6954a;
                a4 a4Var = kcVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                a4Var.f6590a.t(LocaleController.getString(i10), false, true);
                a4Var.invalidate();
                kcVar.g(true, true);
                kcVar.c0(true);
                kcVar.I0.a(false, true);
                kcVar.J0.b(true, true);
                kcVar.h0(true, true);
                return;
        }
    }

    public eb(fb fbVar, boolean z10, Runnable runnable) {
        this.f6926b = fbVar;
        this.d = z10;
        this.f6927c = runnable;
    }
}
