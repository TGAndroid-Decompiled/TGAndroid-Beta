package c3;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import g2.n0;
public final class c0 extends a0 implements Choreographer$VsyncCallback {
    public final Handler f3987e;

    public c0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f3987e = n0.q(null);
    }

    @Override
    public final void a() {
        this.f3984b.registerDisplayListener(this, n0.q(null));
        this.f3983a.postVsyncCallback(this);
    }

    @Override
    public final void b() {
        this.f3984b.unregisterDisplayListener(this);
        this.f3987e.removeCallbacksAndMessages(null);
        this.f3983a.removeVsyncCallback(this);
        this.f3985c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override
    public final void onDisplayChanged(int i3) {
        if (i3 == 0) {
            this.f3983a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f3985c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        long j10 = -9223372036854775807L;
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            if (expectedPresentationTimeNanos != 0) {
                j10 = expectedPresentationTimeNanos;
            }
            this.d = j10;
        } else {
            this.d = -9223372036854775807L;
        }
        this.f3987e.postDelayed(new ai.s(this, 21), 500L);
    }
}
