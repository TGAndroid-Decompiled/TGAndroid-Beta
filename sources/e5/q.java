package e5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import d5.g0;

public final class q implements Choreographer.FrameCallback, Handler.Callback {

    public static final q f5275e = new q();

    public volatile long f5276a = -9223372036854775807L;

    public final Handler f5277b;

    public Choreographer f5278c;
    public int d;

    public q() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = g0.f4795a;
        Handler handler = new Handler(looper, this);
        this.f5277b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override
    public final void doFrame(long j10) {
        this.f5276a = j10;
        Choreographer choreographer = this.f5278c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            try {
                this.f5278c = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e9) {
                d5.a.L("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e9);
                return true;
            }
        }
        if (i10 == 1) {
            Choreographer choreographer = this.f5278c;
            if (choreographer != null) {
                int i11 = this.d + 1;
                this.d = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        } else {
            if (i10 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f5278c;
            if (choreographer2 != null) {
                int i12 = this.d - 1;
                this.d = i12;
                if (i12 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f5276a = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
