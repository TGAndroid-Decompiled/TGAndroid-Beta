package c3;

import android.view.Choreographer;
import android.view.Display;
import g2.n0;
public final class b0 extends a0 implements Choreographer.FrameCallback {
    @Override
    public final void a() {
        long j10;
        this.f3984b.registerDisplayListener(this, n0.q(null));
        this.f3983a.postFrameCallback(this);
        Display display = this.f3984b.getDisplay(0);
        if (display != null) {
            j10 = (long) (1.0E9d / display.getRefreshRate());
        } else {
            g2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j10 = -9223372036854775807L;
        }
        this.d = j10;
    }

    @Override
    public final void b() {
        this.f3984b.unregisterDisplayListener(this);
        this.f3983a.removeFrameCallback(this);
        this.f3985c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override
    public final void doFrame(long j10) {
        this.f3985c = j10;
        this.f3983a.postFrameCallbackDelayed(this, 500L);
    }

    @Override
    public final void onDisplayChanged(int i3) {
        long j10;
        if (i3 == 0) {
            this.f3983a.postFrameCallback(this);
            Display display = this.f3984b.getDisplay(0);
            if (display != null) {
                j10 = (long) (1.0E9d / display.getRefreshRate());
            } else {
                g2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j10 = -9223372036854775807L;
            }
            this.d = j10;
        }
    }
}
