package n2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class d0 extends AudioTrack$StreamEventCallback {
    public final e0 f20144a;

    public d0(e0 e0Var) {
        this.f20144a = e0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        this.f20144a.f20156c.f20169j.e(-1, new m2.d(25));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.f20144a.f20156c.f20169j.e(-1, new m2.d(26));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.f20144a.f20156c.f20169j.e(-1, new m2.d(25));
    }
}
