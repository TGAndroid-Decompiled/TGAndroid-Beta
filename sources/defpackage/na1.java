package defpackage;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class na1 implements VideoSink {
    public final byte a;
    public final ViewGroup b;

    public na1(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z;
        switch (this.a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((oa1) this.b).r > 1000) {
                    z = true;
                } else {
                    z = false;
                }
                ((oa1) this.b).r = SystemClock.elapsedRealtime();
                ((oa1) this.b).s = videoFrame.getRotatedWidth();
                ((oa1) this.b).w = videoFrame.getRotatedHeight();
                ((oa1) this.b).b.d.onFrame(videoFrame);
                if (z && !((oa1) this.b).x) {
                    ((oa1) this.b).x = true;
                    gm.c3(((oa1) this.b).y);
                    return;
                }
                return;
            default:
                ((ya5) this.b).s = SystemClock.elapsedRealtime();
                ((ya5) this.b).w = videoFrame.getRotatedWidth();
                ((ya5) this.b).x = videoFrame.getRotatedHeight();
                akc akcVar = ((ya5) this.b).c;
                if (akcVar != null) {
                    akcVar.d.onFrame(videoFrame);
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
