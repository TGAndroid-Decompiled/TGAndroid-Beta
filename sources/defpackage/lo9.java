package defpackage;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class lo9 extends VoIPService.ProxyVideoSink {
    public final oo9 a;

    public lo9(oo9 oo9Var) {
        this.a = oo9Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.a.r) {
            gm.c3(new kf9(this, (byte) 10));
        }
    }
}
