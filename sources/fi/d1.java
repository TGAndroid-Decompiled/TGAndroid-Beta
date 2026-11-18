package fi;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class d1 implements VideoSink {
    public volatile VideoSink f11836a;
    public volatile int f11837b;
    public volatile int f11838c;
    public final f2.a d = new f2.a(this, 6);
    public final e1 f11839e;

    public d1(e1 e1Var) {
        this.f11839e = e1Var;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.f11837b || rotatedHeight != this.f11838c) {
            this.f11837b = rotatedWidth;
            this.f11838c = rotatedHeight;
            org.telegram.messenger.g0.g3(this.d);
        }
        VideoSink videoSink = this.f11836a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        org.webrtc.d0.a(this, videoSink);
    }
}
