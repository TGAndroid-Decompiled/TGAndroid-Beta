package ei;

import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class e1 extends VoIPService.ProxyVideoSink {
    public final g1 f10216a;

    public e1(g1 g1Var) {
        this.f10216a = g1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f10216a.f10303s) {
            org.telegram.messenger.g0.h3(new ci.d1(this, 21));
        }
    }
}
