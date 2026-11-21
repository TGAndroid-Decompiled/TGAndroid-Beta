package fi;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class d1 implements VideoSink {
    public volatile VideoSink f11876a;
    public volatile int f11877b;
    public volatile int f11878c;
    public final f2.a d = new f2.a(this, 6);
    public final e1 f11879e;

    public d1(e1 e1Var) {
        this.f11879e = e1Var;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f11877b || rotatedHeight != this.f11878c) {
            this.f11877b = rotatedWidth;
            this.f11878c = rotatedHeight;
            org.telegram.messenger.g0.g3(this.d);
        }
        VideoSink videoSink = this.f11876a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
