package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ib implements Runnable {
    public final int f7402a = 1;
    public final jb f7403b;
    public final Runnable f7404c;
    public final boolean d;

    public ib(jb jbVar, Runnable runnable, boolean z10) {
        this.f7403b = jbVar;
        this.f7404c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f7402a) {
            case 0:
                boolean z10 = this.d;
                this.f7403b.f(this.f7404c, z10);
                return;
            default:
                this.f7404c.run();
                pc pcVar = this.f7403b.f7443a;
                c4 c4Var = pcVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                c4Var.f6986a.q(LocaleController.getString(i10), false, true);
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
        this.f7403b = jbVar;
        this.d = z10;
        this.f7404c = runnable;
    }
}
