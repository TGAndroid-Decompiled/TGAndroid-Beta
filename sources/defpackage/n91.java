package defpackage;

import android.os.SystemClock;
import android.view.ViewGroup;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class n91 implements VideoSink {
    public final byte a;
    public final ViewGroup b;

    public n91(ViewGroup viewGroup, byte b) {
        this.a = b;
        this.b = viewGroup;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        boolean z;
        switch (this.a) {
            case 0:
                if (SystemClock.elapsedRealtime() - ((o91) this.b).r > 1000) {
                    z = true;
                } else {
                    z = false;
                }
                ((o91) this.b).r = SystemClock.elapsedRealtime();
                ((o91) this.b).s = videoFrame.getRotatedWidth();
                ((o91) this.b).w = videoFrame.getRotatedHeight();
                ((o91) this.b).b.d.onFrame(videoFrame);
                if (z && !((o91) this.b).x) {
                    ((o91) this.b).x = true;
                    hl.c3(((o91) this.b).y);
                    return;
                }
                return;
            default:
                ((bb5) this.b).s = SystemClock.elapsedRealtime();
                ((bb5) this.b).w = videoFrame.getRotatedWidth();
                ((bb5) this.b).x = videoFrame.getRotatedHeight();
                hmc hmcVar = ((bb5) this.b).c;
                if (hmcVar != null) {
                    hmcVar.d.onFrame(videoFrame);
                    return;
                }
                return;
        }
    }
}
