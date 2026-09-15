package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class b2 extends VoIPService.ProxyVideoSink {
    public final d2 f570a;

    public b2(d2 d2Var) {
        this.f570a = d2Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f570a.f689s) {
            AndroidUtilities.runOnUIThread(new a3.d(this, 3));
        }
    }
}
