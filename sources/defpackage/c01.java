package defpackage;

import java.util.Iterator;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.VideoSource;
public final class c01 implements VideoSink {
    public final byte a;
    public final Object b;

    public c01(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onFrame(VideoFrame videoFrame) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                d01 d01Var = (d01) obj;
                VideoSink incomingVideoSink = d01Var.v.a.getIncomingVideoSink(d01Var.a);
                if (incomingVideoSink != null) {
                    incomingVideoSink.onFrame(videoFrame);
                    return;
                }
                return;
            case 1:
                Iterator it = ((sr9) obj).a.iterator();
                while (it.hasNext()) {
                    ((VideoSink) it.next()).onFrame(videoFrame);
                }
                return;
            default:
                ((VideoSource) obj).lambda$setVideoProcessor$3(videoFrame);
                return;
        }
    }
}
