package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class f0 extends AudioTrack$StreamEventCallback {
    public final g0 f13882a;

    public f0(g0 g0Var) {
        this.f13882a = g0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        this.f13882a.f13888c.f13899j.e(-1, new j2.e(27));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.f13882a.f13888c.f13899j.e(-1, new j2.e(28));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.f13882a.f13888c.f13899j.e(-1, new j2.e(27));
    }
}
