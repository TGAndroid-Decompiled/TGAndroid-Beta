package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class f1 extends VoIPService.ProxyVideoSink {
    public final h1 f5313a;

    public f1(h1 h1Var) {
        this.f5313a = h1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f5313a.f5383s) {
            AndroidUtilities.runOnUIThread(new androidx.fragment.app.d(this, 7));
        }
    }
}
