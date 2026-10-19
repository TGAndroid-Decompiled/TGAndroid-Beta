package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class g0 extends AudioTrack$StreamEventCallback {
    public final h0 f14688a;

    public g0(h0 h0Var) {
        this.f14688a = h0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        this.f14688a.f14693c.f14702j.e(-1, new j2.e(29));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.f14688a.f14693c.f14702j.e(-1, new f0(0));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.f14688a.f14693c.f14702j.e(-1, new j2.e(29));
    }
}
