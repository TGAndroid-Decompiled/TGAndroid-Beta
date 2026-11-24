package defpackage;

import java.util.Iterator;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;
public final class uz0 implements VideoSink {
    public final byte a;
    public final Object b;

    public uz0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                vz0 vz0Var = (vz0) obj;
                VideoSink incomingVideoSink = vz0Var.v.a.getIncomingVideoSink(vz0Var.a);
                if (incomingVideoSink != null) {
                    incomingVideoSink.onFrame(videoFrame);
                    return;
                }
                return;
            case 1:
                Iterator it = ((bo9) obj).a.iterator();
                while (it.hasNext()) {
                    ((VideoSink) it.next()).onFrame(videoFrame);
                }
                return;
            default:
                ((VideoSource) obj).lambda$setVideoProcessor$1(videoFrame);
                return;
        }
    }

    @Override
    public final void setParentSink(VideoSink videoSink) {
        byte b = this.a;
    }

    private final void a(VideoSink videoSink) {
    }

    private final void b(VideoSink videoSink) {
    }

    private final void c(VideoSink videoSink) {
    }
}
