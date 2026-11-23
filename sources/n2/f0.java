package n2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class f0 extends AudioTrack$StreamEventCallback {
    public final g0 f21189a;

    public f0(g0 g0Var) {
        this.f21189a = g0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        this.f21189a.f21194c.f21204j.e(-1, new a0(2));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.f21189a.f21194c.f21204j.e(-1, new a0(3));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.f21189a.f21194c.f21204j.e(-1, new a0(2));
    }
}
