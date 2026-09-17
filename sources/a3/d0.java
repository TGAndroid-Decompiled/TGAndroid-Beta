package a3;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
public final class d0 implements Choreographer.FrameCallback, Handler.Callback {
    public static final d0 f81e = new d0();
    public volatile long f82a = -9223372036854775807L;
    public final Handler f83b;
    public Choreographer f84c;
    public int d;

    public d0() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = e2.d0.f8765a;
        Handler handler = new Handler(looper, this);
        this.f83b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override
    public final void doFrame(long j3) {
        this.f82a = j3;
        Choreographer choreographer = this.f84c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return false;
                }
                Choreographer choreographer = this.f84c;
                if (choreographer != null) {
                    int i11 = this.d - 1;
                    this.d = i11;
                    if (i11 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f82a = -9223372036854775807L;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.f84c;
            if (choreographer2 != null) {
                int i12 = this.d + 1;
                this.d = i12;
                if (i12 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.f84c = Choreographer.getInstance();
        } catch (RuntimeException e7) {
            e2.a.o("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e7);
        }
        return true;
    }
}
