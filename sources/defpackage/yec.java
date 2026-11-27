package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Choreographer;
import android.view.Choreographer$VsyncCallback;
public final class yec extends wec implements Choreographer$VsyncCallback {
    public final Handler e;

    public yec(Choreographer choreographer, DisplayManager displayManager) {
        super(choreographer, displayManager);
        this.e = gcc.q(null);
    }

    @Override
    public final void a() {
        this.b.registerDisplayListener(this, gcc.q(null));
        Choreographer choreographer = this.a;
        choreographer.removeVsyncCallback(this);
        choreographer.postVsyncCallback(this);
    }

    @Override
    public final void b() {
        this.b.unregisterDisplayListener(this);
        this.e.removeCallbacksAndMessages(null);
        this.a.removeVsyncCallback(this);
        this.c = -9223372036854775807L;
        this.d = -9223372036854775807L;
    }

    public final void c() {
        this.a.postVsyncCallback(this);
    }

    @Override
    public final void onDisplayChanged(int i) {
        if (i == 0) {
            this.e.removeCallbacksAndMessages(null);
            Choreographer choreographer = this.a;
            choreographer.removeVsyncCallback(this);
            choreographer.postVsyncCallback(this);
        }
    }

    public final void onVsync(Choreographer.FrameData frameData) {
        this.c = frameData.getFrameTimeNanos();
        Choreographer.FrameTimeline[] frameTimelines = frameData.getFrameTimelines();
        long j = -9223372036854775807L;
        if (frameTimelines.length >= 2) {
            long expectedPresentationTimeNanos = frameTimelines[1].getExpectedPresentationTimeNanos() - frameTimelines[0].getExpectedPresentationTimeNanos();
            if (expectedPresentationTimeNanos != 0) {
                j = expectedPresentationTimeNanos;
            }
            this.d = j;
        } else {
            this.d = -9223372036854775807L;
        }
        this.e.removeCallbacksAndMessages(null);
        this.e.postDelayed(new azb(this, (byte) 14), 500L);
    }
}
