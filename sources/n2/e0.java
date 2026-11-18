package n2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class e0 extends AudioTrack$StreamEventCallback {
    public final f0 f21089a;

    public e0(f0 f0Var) {
        this.f21089a = f0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        this.f21089a.f21095c.f21107j.e(-1, new a0(2));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.f21089a.f21095c.f21107j.e(-1, new a0(3));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.f21089a.f21095c.f21107j.e(-1, new a0(2));
    }
}
