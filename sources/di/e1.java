package di;

import bi.ab;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class e1 extends VoIPService.ProxyVideoSink {
    public final g1 f8947a;

    public e1(g1 g1Var) {
        this.f8947a = g1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f8947a.f9009s) {
            org.telegram.messenger.g0.h3(new ab(this, 15));
        }
    }
}
