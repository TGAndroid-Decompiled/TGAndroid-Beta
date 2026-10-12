package a3;

import android.view.Choreographer;
import android.view.Display;
public final class d0 extends c0 implements Choreographer.FrameCallback {
    @Override
    public final void a() {
        long j10;
        this.f73b.registerDisplayListener(this, e2.m0.q(null));
        this.f72a.postFrameCallback(this);
        Display display = this.f73b.getDisplay(0);
        if (display != null) {
            j10 = (long) (1.0E9d / display.getRefreshRate());
        } else {
            e2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
        }
        this.d = j10;
    }

    @Override
    public final void b() {
        this.f73b.unregisterDisplayListener(this);
        this.f72a.removeFrameCallback(this);
        this.f74c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override
    public final void doFrame(long j10) {
        this.f74c = j10;
        this.f72a.postFrameCallbackDelayed(this, 500L);
    }

    @Override
    public final void onDisplayChanged(int i10) {
        long j10;
        if (i10 == 0) {
            this.f72a.postFrameCallback(this);
            Display display = this.f73b.getDisplay(0);
            if (display != null) {
                j10 = (long) (1.0E9d / display.getRefreshRate());
            } else {
                e2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j10 = -9223372036854775807L;
            }
            this.d = j10;
        }
    }
}
