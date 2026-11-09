package di;

import bi.ab;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class h1 implements VideoSink {
    public volatile VideoSink f9055a;
    public volatile int f9056b;
    public volatile int f9057c;
    public final ab d = new ab(this, 18);
    public final i1 f9058e;

    public h1(i1 i1Var) {
        this.f9058e = i1Var;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f9056b || rotatedHeight != this.f9057c) {
            this.f9056b = rotatedWidth;
            this.f9057c = rotatedHeight;
            org.telegram.messenger.g0.h3(this.d);
        }
        VideoSink videoSink = this.f9055a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
