package defpackage;

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class pn9 implements VideoSink {
    public volatile ta8 a;
    public volatile zhc b;
    public volatile int c;
    public volatile int d;
    public volatile long e;
    public final zk9 f = new zk9(this, (byte) 6);
    public final sn9 h;

    public pn9(sn9 sn9Var) {
        this.h = sn9Var;
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
            gl.c3(this.f);
        }
        ta8 ta8Var = this.a;
        zhc zhcVar = this.b;
        if (ta8Var != null) {
            ta8Var.onFrame(videoFrame);
        }
        if (zhcVar != null) {
            zhcVar.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
    }
}
