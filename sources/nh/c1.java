package nh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class c1 extends VoIPService.ProxyVideoSink {
    public final e1 f15116a;

    public c1(e1 e1Var) {
        this.f15116a = e1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f15116a.f15278s) {
            AndroidUtilities.runOnUIThread(new lh.b(this, 22));
        }
    }
}
