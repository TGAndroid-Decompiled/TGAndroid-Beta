package fi;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class a1 extends VoIPService.ProxyVideoSink {
    public final c1 f11718a;

    public a1(c1 c1Var) {
        this.f11718a = c1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f11718a.f11800s) {
            org.telegram.messenger.g0.g3(new f2.a(this, 3));
        }
    }
}
