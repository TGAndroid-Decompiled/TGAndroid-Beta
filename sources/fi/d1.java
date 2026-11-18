package fi;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class d1 implements VideoSink {
    public volatile VideoSink f11839a;
    public volatile int f11840b;
    public volatile int f11841c;
    public final f2.a d = new f2.a(this, 6);
    public final e1 f11842e;

    public d1(e1 e1Var) {
        this.f11842e = e1Var;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f11840b || rotatedHeight != this.f11841c) {
            this.f11840b = rotatedWidth;
            this.f11841c = rotatedHeight;
            org.telegram.messenger.g0.g3(this.d);
        }
        VideoSink videoSink = this.f11839a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
