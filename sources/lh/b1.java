package lh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
import org.webrtc.VideoFrame;
public final class b1 extends VoIPService.ProxyVideoSink {
    public final d1 f15369a;

    public b1(d1 d1Var) {
        this.f15369a = d1Var;
    }

    @Override
    public final synchronized void onFrame(VideoFrame videoFrame) {
        super.onFrame(videoFrame);
        if (this.f15369a.f15460s) {
            AndroidUtilities.runOnUIThread(new jh.o(this, 22));
        }
    }
}
