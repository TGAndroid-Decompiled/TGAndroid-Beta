package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pa implements Runnable {
    public final int f9605a = 1;
    public final qa f9606b;
    public final Runnable f9607c;
    public final boolean d;

    public pa(qa qaVar, Runnable runnable, boolean z10) {
        this.f9606b = qaVar;
        this.f9607c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f9605a) {
            case 0:
                boolean z10 = this.d;
                this.f9606b.g(this.f9607c, z10);
                return;
            default:
                this.f9607c.run();
                vb vbVar = this.f9606b.f9664a;
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
        this.f9606b = qaVar;
        this.d = z10;
        this.f9607c = runnable;
    }
}
