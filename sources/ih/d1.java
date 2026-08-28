package ih;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class d1 extends VoIPService.ProxyVideoSink {
    public final f1 f11319a;

    public d1(f1 f1Var) {
        this.f11319a = f1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f11319a.f11405s) {
            AndroidUtilities.runOnUIThread(new g(this, 1));
        }
    }
}
