package di;

import bi.ab;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class h1 implements VideoSink {
    public volatile VideoSink f9060a;
    public volatile int f9061b;
    public volatile int f9062c;
    public final ab d = new ab(this, 18);
    public final i1 f9063e;

    public h1(i1 i1Var) {
        this.f9063e = i1Var;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f9061b || rotatedHeight != this.f9062c) {
            this.f9061b = rotatedWidth;
            this.f9062c = rotatedHeight;
            org.telegram.messenger.g0.h3(this.d);
        }
        VideoSink videoSink = this.f9060a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
