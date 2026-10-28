package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class f1 extends VoIPService.ProxyVideoSink {
    public final h1 f8546a;

    public f1(h1 h1Var) {
        this.f8546a = h1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f8546a.f8609s) {
            AndroidUtilities.runOnUIThread(new bi.u6(this, 14));
        }
    }
}
