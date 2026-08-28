package e5;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import d5.f0;
public final class r implements Choreographer.FrameCallback, Handler.Callback {
    public static final r f4918e = new r();
    public volatile long f4919a = -9223372036854775807L;
    public final Handler f4920b;
    public Choreographer f4921c;
    public int d;

    public r() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i9 = f0.f4349a;
        Handler handler = new Handler(looper, this);
        this.f4920b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override
    public final void doFrame(long j10) {
        this.f4919a = j10;
        Choreographer choreographer = this.f4921c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i9 = message.what;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return false;
                }
                Choreographer choreographer = this.f4921c;
                if (choreographer != null) {
                    int i10 = this.d - 1;
                    this.d = i10;
                    if (i10 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f4919a = -9223372036854775807L;
                        return true;
                    }
                }
            } else {
                Choreographer choreographer2 = this.f4921c;
                if (choreographer2 != null) {
                    int i11 = this.d + 1;
                    this.d = i11;
                    if (i11 == 1) {
                        choreographer2.postFrameCallback(this);
                    }
                }
            }
            return true;
        }
        try {
            this.f4921c = Choreographer.getInstance();
            return true;
        } catch (RuntimeException e10) {
            d5.a.L("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            return true;
        }
    }
}
