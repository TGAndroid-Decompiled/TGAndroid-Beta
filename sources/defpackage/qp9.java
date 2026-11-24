package defpackage;

import android.os.SystemClock;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class qp9 implements VideoSink {
    public volatile wc8 a;
    public volatile zjc b;
    public volatile int c;
    public volatile int d;
    public volatile long e;
    public final kf9 f = new kf9(this, (byte) 14);
    public final tp9 h;

    public qp9(tp9 tp9Var) {
        this.h = tp9Var;
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
            gm.c3(this.f);
        }
        wc8 wc8Var = this.a;
        zjc zjcVar = this.b;
        if (wc8Var != null) {
            wc8Var.onFrame(videoFrame);
        }
        if (zjcVar != null) {
            zjcVar.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
    }
}
