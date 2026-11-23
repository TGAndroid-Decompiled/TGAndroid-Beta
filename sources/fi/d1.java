package fi;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class d1 implements VideoSink {
    public volatile VideoSink f11841a;
    public volatile int f11842b;
    public volatile int f11843c;
    public final f2.a d = new f2.a(this, 5);
    public final e1 f11844e;

    public d1(e1 e1Var) {
        this.f11844e = e1Var;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f11842b || rotatedHeight != this.f11843c) {
            this.f11842b = rotatedWidth;
            this.f11843c = rotatedHeight;
            org.telegram.messenger.g0.g3(this.d);
        }
        VideoSink videoSink = this.f11841a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
