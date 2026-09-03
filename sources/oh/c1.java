package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class c1 extends VoIPService.ProxyVideoSink {
    public final e1 f16912a;

    public c1(e1 e1Var) {
        this.f16912a = e1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f16912a.f17011s) {
            AndroidUtilities.runOnUIThread(new lh.c3(this, 25));
        }
    }
}
