package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class km9 extends VoIPService.ProxyVideoSink {
    public final nm9 a;

    public km9(nm9 nm9Var) {
        this.a = nm9Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.a.r) {
            gl.c3(new zk9(this, (byte) 2));
        }
    }
}
