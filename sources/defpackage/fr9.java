package defpackage;

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class fr9 implements VideoSink {
    public volatile ke8 a;
    public volatile gmc b;
    public volatile int c;
    public volatile int d;
    public volatile long e;
    public final v59 f = new v59(this, (byte) 22);
    public final ir9 h;

    public fr9(ir9 ir9Var) {
        this.h = ir9Var;
    }

    public final boolean a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.e < j) {
            if (elapsedRealtime - j >= 700) {
                return false;
            }
            return true;
        } else if (elapsedRealtime - this.e >= 5000) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.e > 5000) {
            z = true;
        } else {
            z = false;
        }
        this.e = elapsedRealtime;
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.c || rotatedHeight != this.d || z) {
            this.c = rotatedWidth;
            this.d = rotatedHeight;
            hl.c3(this.f);
        }
        ke8 ke8Var = this.a;
        gmc gmcVar = this.b;
        if (ke8Var != null) {
            ke8Var.onFrame(videoFrame);
        }
        if (gmcVar != null) {
            gmcVar.onFrame(videoFrame);
        }
    }
}
