package di;

import bi.ab;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class h1 implements VideoSink {
    public volatile VideoSink f9065a;
    public volatile int f9066b;
    public volatile int f9067c;
    public final ab d = new ab(this, 18);
    public final i1 f9068e;

    public h1(i1 i1Var) {
        this.f9068e = i1Var;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f9066b || rotatedHeight != this.f9067c) {
            this.f9066b = rotatedWidth;
            this.f9067c = rotatedHeight;
            org.telegram.messenger.g0.h3(this.d);
        }
        VideoSink videoSink = this.f9065a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.e0.a(this, videoSink);
    }
}
