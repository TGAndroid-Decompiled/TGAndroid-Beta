package fi;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class a1 extends VoIPService.ProxyVideoSink {
    public final c1 f11715a;

    public a1(c1 c1Var) {
        this.f11715a = c1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f11715a.f11797s) {
            org.telegram.messenger.g0.g3(new f2.a(this, 3));
        }
    }
}
