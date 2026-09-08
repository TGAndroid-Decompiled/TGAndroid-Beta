package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class r1 extends VoIPService.ProxyVideoSink {
    public final t1 f3646a;

    public r1(t1 t1Var) {
        this.f3646a = t1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f3646a.f3749s) {
            AndroidUtilities.runOnUIThread(new a3.d(this, 13));
        }
    }
}
