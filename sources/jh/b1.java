package jh;

import hh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;

public final class b1 extends VoIPService.ProxyVideoSink {

    public final d1 f13075a;

    public b1(d1 d1Var) {
        this.f13075a = d1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f13075a.f13181s) {
            AndroidUtilities.runOnUIThread(new y9(this, 8));
        }
    }
}
