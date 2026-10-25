package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class la implements Runnable {
    public final int f11185a = 1;
    public final ma f11186b;
    public final Runnable f11187c;
    public final boolean d;

    public la(ma maVar, Runnable runnable, boolean z10) {
        this.f11186b = maVar;
        this.f11187c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f11185a) {
            case 0:
                boolean z10 = this.d;
                this.f11186b.g(this.f11187c, z10);
                return;
            default:
                this.f11187c.run();
                sb sbVar = this.f11186b.f11270a;
                t3 t3Var = sbVar.T0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                t3Var.f11704a.t(LocaleController.getString(i10), false, true);
                t3Var.invalidate();
                sbVar.g(true, true);
                sbVar.c0(true);
                sbVar.I0.a(false, true);
                sbVar.J0.b(true, true);
                sbVar.h0(true, true);
                return;
        }
    }

    public la(ma maVar, boolean z10, Runnable runnable) {
        this.f11186b = maVar;
        this.d = z10;
        this.f11187c = runnable;
    }
}
