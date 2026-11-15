package d3;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import h2.l0;
public final class b0 extends z implements Choreographer$VsyncCallback {
    public final Handler f7350e;

    public b0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f7350e = l0.q(null);
    }

    @Override
    public final void a() {
        this.f7495b.registerDisplayListener(this, l0.q(null));
        this.f7494a.postVsyncCallback(this);
    }

    @Override
    public final void b() {
        this.f7495b.unregisterDisplayListener(this);
        this.f7350e.removeCallbacksAndMessages(null);
        this.f7494a.removeVsyncCallback(this);
        this.f7496c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override
    public final void onDisplayChanged(int i7) {
        if (i7 == 0) {
            this.f7494a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f7496c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        long j3 = -9223372036854775807L;
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            if (expectedPresentationTimeNanos != 0) {
                j3 = expectedPresentationTimeNanos;
            }
            this.d = j3;
        } else {
            this.d = -9223372036854775807L;
        }
        this.f7350e.postDelayed(new ch.w(this, 4), 500L);
    }
}
