package defpackage;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class e91 implements VideoSink {
    public final byte a;
    public final ViewGroup b;

    public e91(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z;
        switch (this.a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((f91) this.b).r > 1000) {
                    z = true;
                } else {
                    z = false;
                }
                ((f91) this.b).r = SystemClock.elapsedRealtime();
                ((f91) this.b).s = videoFrame.getRotatedWidth();
                ((f91) this.b).w = videoFrame.getRotatedHeight();
                ((f91) this.b).b.d.onFrame(videoFrame);
                if (z && !((f91) this.b).x) {
                    ((f91) this.b).x = true;
                    gl.c3(((f91) this.b).y);
                    return;
                }
                return;
            default:
                ((z85) this.b).s = SystemClock.elapsedRealtime();
                ((z85) this.b).w = videoFrame.getRotatedWidth();
                ((z85) this.b).x = videoFrame.getRotatedHeight();
                aic aicVar = ((z85) this.b).c;
                if (aicVar != null) {
                    aicVar.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        byte b = this.a;
    }

    private final void a(VideoSink videoSink) {
    }

    private final void b(VideoSink videoSink) {
    }
}
