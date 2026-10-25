package a3;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
public final class e0 extends c0 implements Choreographer$VsyncCallback {
    public final Handler e;

    public e0(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.e = e2.n0.q(null);
    }

    public static void c(e0 e0Var) {
        e0Var.f72a.postVsyncCallback(e0Var);
    }

    @Override
    public final void a() {
        this.f73b.registerDisplayListener(this, e2.n0.q(null));
        this.f72a.postVsyncCallback(this);
    }

    @Override
    public final void b() {
        this.f73b.unregisterDisplayListener(this);
        this.e.removeCallbacksAndMessages(null);
        this.f72a.removeVsyncCallback(this);
        this.f74c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    @Override
    public final void onDisplayChanged(int i10) {
        if (i10 == 0) {
            this.f72a.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.f74c = frameData.getFrameTimeNanos();
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
        this.e.postDelayed(new d(this, 2), 500L);
    }
}
