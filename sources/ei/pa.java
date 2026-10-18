package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pa implements Runnable {
    public final int f9604a = 1;
    public final qa f9605b;
    public final Runnable f9606c;
    public final boolean d;

    public pa(qa qaVar, Runnable runnable, boolean z10) {
        this.f9605b = qaVar;
        this.f9606c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f9604a) {
            case 0:
                boolean z10 = this.d;
                this.f9605b.g(this.f9606c, z10);
                return;
            default:
                this.f9606c.run();
                vb vbVar = this.f9605b.f9663a;
                v3 v3Var = vbVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                v3Var.f9933a.t(LocaleController.getString(i10), false, true);
                v3Var.invalidate();
                vbVar.g(true, true);
                vbVar.c0(true);
                vbVar.I0.a(false, true);
                vbVar.J0.b(true, true);
                vbVar.h0(true, true);
                return;
        }
    }

    public pa(qa qaVar, boolean z10, Runnable runnable) {
        this.f9605b = qaVar;
        this.d = z10;
        this.f9606c = runnable;
    }
}
