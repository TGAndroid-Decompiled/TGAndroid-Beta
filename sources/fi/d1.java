package fi;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class d1 implements VideoSink {
    public volatile VideoSink f11831a;
    public volatile int f11832b;
    public volatile int f11833c;
    public final f2.a d = new f2.a(this, 5);
    public final e1 f11834e;

    public d1(e1 e1Var) {
        this.f11834e = e1Var;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f11832b || rotatedHeight != this.f11833c) {
            this.f11832b = rotatedWidth;
            this.f11833c = rotatedHeight;
            org.telegram.messenger.g0.g3(this.d);
        }
        VideoSink videoSink = this.f11831a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
