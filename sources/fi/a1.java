package fi;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class a1 extends VoIPService.ProxyVideoSink {
    public final c1 f11744a;

    public a1(c1 c1Var) {
        this.f11744a = c1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f11744a.f11840s) {
            org.telegram.messenger.g0.g3(new f2.a(this, 3));
        }
    }
}
