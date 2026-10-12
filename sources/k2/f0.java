package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class f0 extends AudioTrack$StreamEventCallback {
    public final g0 f13879a;

    public f0(g0 g0Var) {
        this.f13879a = g0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        this.f13879a.f13885c.f13896j.e(-1, new j2.e(27));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.f13879a.f13885c.f13896j.e(-1, new j2.e(28));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.f13879a.f13885c.f13896j.e(-1, new j2.e(27));
    }
}
