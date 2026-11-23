package n2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class e0 extends AudioTrack$StreamEventCallback {
    public final f0 f21086a;

    public e0(f0 f0Var) {
        this.f21086a = f0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i7) {
        this.f21086a.f21092c.f21104j.e(-1, new a0(2));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.f21086a.f21092c.f21104j.e(-1, new a0(3));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.f21086a.f21092c.f21104j.e(-1, new a0(2));
    }
}
