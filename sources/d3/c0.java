package d3;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
import bi.ab;
import h2.m0;
public final class c0 extends a0 implements Choreographer$VsyncCallback {
    public final Handler f7963e;

    public c0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.f7963e = m0.q(null);
    }

    @Override
    public final void a() {
        this.f7960b.registerDisplayListener(this, m0.q(null));
        this.f7959a.postVsyncCallback(this);
    }

    @Override
    public final void b() {
        this.f7960b.unregisterDisplayListener(this);
        this.f7963e.removeCallbacksAndMessages(null);
        this.f7959a.removeVsyncCallback(this);
        this.f7961c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override
    public final void onDisplayChanged(int i7) {
        if (i7 == 0) {
            this.f7959a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f7961c = frameData.getFrameTimeNanos();
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
        this.f7963e.postDelayed(new ab(this, 13), 500L);
    }
}
