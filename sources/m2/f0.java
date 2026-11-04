package m2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class f0 extends AudioTrack$StreamEventCallback {
    public final g0 f18858a;

    public f0(g0 g0Var) {
        this.f18858a = g0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i3) {
        this.f18858a.f18863c.f18873j.e(-1, new l2.d(20));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.f18858a.f18863c.f18873j.e(-1, new l2.d(21));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.f18858a.f18863c.f18873j.e(-1, new l2.d(20));
    }
}
