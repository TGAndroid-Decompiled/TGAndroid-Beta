package defpackage;

import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
public final class w76 implements VideoSink {
    public volatile VideoSink a;
    public volatile int b;
    public volatile int c;
    public final tp5 d = new tp5(this, (byte) 15);
    public final x76 e;

    public w76(x76 x76Var) {
        this.e = x76Var;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        int rotatedWidth = videoFrame.getRotatedWidth();
        int rotatedHeight = videoFrame.getRotatedHeight();
        if (rotatedWidth != this.b || rotatedHeight != this.c) {
            this.b = rotatedWidth;
            this.c = rotatedHeight;
            gl.c3(this.d);
        }
        VideoSink videoSink = this.a;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
    }
}
