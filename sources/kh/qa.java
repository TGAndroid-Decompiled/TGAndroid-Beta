package kh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class qa implements Runnable {
    public final int f15900a = 1;
    public final ra f15901b;
    public final Runnable f15902c;
    public final boolean d;

    public qa(ra raVar, Runnable runnable, boolean z10) {
        this.f15901b = raVar;
        this.f15902c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f15900a) {
            case 0:
                boolean z10 = this.d;
                this.f15901b.f(this.f15902c, z10);
                return;
            default:
                this.f15902c.run();
                wb wbVar = this.f15901b.f15971a;
                v3 v3Var = wbVar.P0;
                if (this.d) {
                    i9 = R.string.StoryHintSwipeToZoom;
                } else {
                    i9 = R.string.StoryHintPinchToZoom;
                }
                v3Var.f16192a.q(LocaleController.getString(i9), false, true);
                v3Var.invalidate();
                wbVar.h(true, true);
                wbVar.d0(true);
                wbVar.E0.a(false, true);
                wbVar.F0.b(true, true);
                wbVar.i0(true, true);
                return;
        }
    }

    public qa(ra raVar, boolean z10, Runnable runnable) {
        this.f15901b = raVar;
        this.d = z10;
        this.f15902c = runnable;
    }
}
