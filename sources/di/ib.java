package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ib implements Runnable {
    public final int f7430a = 1;
    public final jb f7431b;
    public final Runnable f7432c;
    public final boolean d;

    public ib(jb jbVar, Runnable runnable, boolean z10) {
        this.f7431b = jbVar;
        this.f7432c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f7430a) {
            case 0:
                boolean z10 = this.d;
                this.f7431b.f(this.f7432c, z10);
                return;
            default:
                this.f7432c.run();
                pc pcVar = this.f7431b.f7471a;
                c4 c4Var = pcVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                c4Var.f7014a.q(LocaleController.getString(i10), false, true);
                c4Var.invalidate();
                pcVar.h(true, true);
                pcVar.d0(true);
                pcVar.I0.a(false, true);
                pcVar.J0.b(true, true);
                pcVar.i0(true, true);
                return;
        }
    }

    public ib(jb jbVar, boolean z10, Runnable runnable) {
        this.f7431b = jbVar;
        this.d = z10;
        this.f7432c = runnable;
    }
}
