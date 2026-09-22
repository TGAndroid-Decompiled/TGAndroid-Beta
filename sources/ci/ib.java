package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ib implements Runnable {
    public final int f4814a = 1;
    public final jb f4815b;
    public final Runnable f4816c;
    public final boolean d;

    public ib(jb jbVar, Runnable runnable, boolean z10) {
        this.f4815b = jbVar;
        this.f4816c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f4814a) {
            case 0:
                boolean z10 = this.d;
                this.f4815b.f(this.f4816c, z10);
                return;
            default:
                this.f4816c.run();
                oc ocVar = this.f4815b.f4856a;
                c4 c4Var = ocVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                c4Var.f4424a.q(LocaleController.getString(i10), false, true);
                c4Var.invalidate();
                ocVar.h(true, true);
                ocVar.d0(true);
                ocVar.I0.a(false, true);
                ocVar.J0.b(true, true);
                ocVar.i0(true, true);
                return;
        }
    }

    public ib(jb jbVar, boolean z10, Runnable runnable) {
        this.f4815b = jbVar;
        this.d = z10;
        this.f4816c = runnable;
    }
}
