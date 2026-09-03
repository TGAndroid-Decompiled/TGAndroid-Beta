package i5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import h5.d0;
public final class r implements Choreographer.FrameCallback, Handler.Callback {
    public static final r e = new r();
    public volatile long f7295a = -9223372036854775807L;
    public final Handler f7296b;
    public Choreographer f7297c;
    public int d;

    public r() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i10 = d0.f6924a;
        Handler handler = new Handler(looper, this);
        this.f7296b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override
    public final void doFrame(long j10) {
        this.f7295a = j10;
        Choreographer choreographer = this.f7297c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                Choreographer choreographer = this.f7297c;
                if (choreographer != null) {
                    int i11 = this.d - 1;
                    this.d = i11;
                    if (i11 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f7295a = -9223372036854775807L;
                        return true;
                    }
                }
            } else {
                Choreographer choreographer2 = this.f7297c;
                if (choreographer2 != null) {
                    int i12 = this.d + 1;
                    this.d = i12;
                    if (i12 == 1) {
                        choreographer2.postFrameCallback(this);
                    }
                }
            }
            return true;
        }
        try {
            this.f7297c = Choreographer.getInstance();
            return true;
        } catch (RuntimeException e6) {
            h5.a.L("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e6);
            return true;
        }
    }
}
