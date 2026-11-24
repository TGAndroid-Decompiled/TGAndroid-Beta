package defpackage;

import android.view.Choreographer;
import android.view.Display;
public final class adc extends zcc implements Choreographer.FrameCallback {
    @Override
    public final void a() {
        long j;
        this.b.registerDisplayListener(this, hac.q(null));
        this.a.removeFrameCallback(this);
        this.a.postFrameCallback(this);
        Display display = this.b.getDisplay(0);
        if (display != null) {
            j = (long) (1.0E9d / display.getRefreshRate());
        } else {
            ncd.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            j = -9223372036854775807L;
        }
        this.d = j;
    }

    @Override
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.a.removeFrameCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override
    public final void doFrame(long j) {
        this.c = j;
        this.a.removeFrameCallback(this);
        this.a.postFrameCallbackDelayed(this, 500L);
    }

    @Override
    public final void onDisplayChanged(int i) {
        long j;
        if (i == 0) {
            this.a.removeFrameCallback(this);
            this.a.postFrameCallback(this);
            Display display = this.b.getDisplay(0);
            if (display != null) {
                j = (long) (1.0E9d / display.getRefreshRate());
            } else {
                ncd.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
                j = -9223372036854775807L;
            }
            this.d = j;
        }
    }
}
