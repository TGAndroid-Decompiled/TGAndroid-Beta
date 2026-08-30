package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class c1 extends VoIPService.ProxyVideoSink {
    public final e1 f15136a;

    public c1(e1 e1Var) {
        this.f15136a = e1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f15136a.f15298s) {
            AndroidUtilities.runOnUIThread(new lh.b(this, 22));
        }
    }
}
