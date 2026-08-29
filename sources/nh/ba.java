package nh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ba implements Runnable {
    public final int f17441a = 1;
    public final ca f17442b;
    public final Runnable f17443c;
    public final boolean d;

    public ba(ca caVar, Runnable runnable, boolean z10) {
        this.f17442b = caVar;
        this.f17443c = runnable;
        this.d = z10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f17441a) {
            case 0:
                boolean z10 = this.d;
                this.f17442b.f(this.f17443c, z10);
                return;
            default:
                this.f17443c.run();
                gb gbVar = this.f17442b.f17486a;
                s3 s3Var = gbVar.P0;
                if (this.d) {
                    i10 = R.string.StoryHintSwipeToZoom;
                } else {
                    i10 = R.string.StoryHintPinchToZoom;
                }
                s3Var.f18545a.q(LocaleController.getString(i10), false, true);
                s3Var.invalidate();
                gbVar.h(true, true);
                gbVar.d0(true);
                gbVar.E0.a(false, true);
                gbVar.F0.b(true, true);
                gbVar.i0(true, true);
                return;
        }
    }

    public ba(ca caVar, boolean z10, Runnable runnable) {
        this.f17442b = caVar;
        this.d = z10;
        this.f17443c = runnable;
    }
}
