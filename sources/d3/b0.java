package d3;

import android.view.Choreographer;
import android.view.Display;
import h2.m0;
public final class b0 extends a0 implements Choreographer.FrameCallback {
    @Override
    public final void a() {
        long j3;
        this.f7962b.registerDisplayListener(this, m0.q(null));
        this.f7961a.postFrameCallback(this);
        Display display = this.f7962b.getDisplay(0);
        if (display != null) {
            j3 = (long) (1.0E9d / display.getRefreshRate());
        } else {
            h2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j3 = -9223372036854775807L;
        }
        this.d = j3;
    }

    @Override
    public final void b() {
        this.f7962b.unregisterDisplayListener(this);
        this.f7961a.removeFrameCallback(this);
        this.f7963c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override
    public final void doFrame(long j3) {
        this.f7963c = j3;
        this.f7961a.postFrameCallbackDelayed(this, 500L);
    }

    @Override
    public final void onDisplayChanged(int i7) {
        long j3;
        if (i7 == 0) {
            this.f7961a.postFrameCallback(this);
            Display display = this.f7962b.getDisplay(0);
            if (display != null) {
                j3 = (long) (1.0E9d / display.getRefreshRate());
            } else {
                h2.a.l("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j3 = -9223372036854775807L;
            }
            this.d = j3;
        }
    }
}
