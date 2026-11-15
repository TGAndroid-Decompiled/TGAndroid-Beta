package fi;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class f1 implements VideoSink {
    public volatile VideoSink f11691a;
    public volatile int f11692b;
    public volatile int f11693c;
    public final c1 d = new c1(this, 2);
    public final g1 f11694e;

    public f1(g1 g1Var) {
        this.f11694e = g1Var;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f11692b || rotatedHeight != this.f11693c) {
            this.f11692b = rotatedWidth;
            this.f11693c = rotatedHeight;
            org.telegram.messenger.g0.h3(this.d);
        }
        VideoSink videoSink = this.f11691a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
