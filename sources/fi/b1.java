package fi;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class b1 extends VoIPService.ProxyVideoSink {
    public final e1 f11450a;

    public b1(e1 e1Var) {
        this.f11450a = e1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f11450a.f11660s) {
            org.telegram.messenger.g0.h3(new ch.w(this, 29));
        }
    }
}
