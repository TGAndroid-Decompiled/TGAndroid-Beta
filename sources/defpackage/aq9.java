package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class aq9 extends VoIPService.ProxyVideoSink {
    public final dq9 a;

    public aq9(dq9 dq9Var) {
        this.a = dq9Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.a.r) {
            hl.c3(new v59(this, (byte) 18));
        }
    }
}
