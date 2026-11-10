package n2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class d0 extends AudioTrack$StreamEventCallback {
    public final e0 f20149a;

    public d0(e0 e0Var) {
        this.f20149a = e0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        this.f20149a.f20161c.f20174j.e(-1, new m2.d(25));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.f20149a.f20161c.f20174j.e(-1, new m2.d(26));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.f20149a.f20161c.f20174j.e(-1, new m2.d(25));
    }
}
