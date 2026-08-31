package oh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class c1 extends VoIPService.ProxyVideoSink {
    public final e1 f16910a;

    public c1(e1 e1Var) {
        this.f16910a = e1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f16910a.f17009s) {
            AndroidUtilities.runOnUIThread(new lh.c3(this, 25));
        }
    }
}
