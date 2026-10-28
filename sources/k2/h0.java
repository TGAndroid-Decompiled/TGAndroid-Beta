package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class h0 extends AudioTrack$StreamEventCallback {
    public final i0 f16168a;

    public h0(i0 i0Var) {
        this.f16168a = i0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        this.f16168a.f16173c.f16182j.e(-1, new jh.l(5));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.f16168a.f16173c.f16182j.e(-1, new jh.l(6));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.f16168a.f16173c.f16182j.e(-1, new jh.l(5));
    }
}
