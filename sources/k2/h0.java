package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class h0 extends AudioTrack$StreamEventCallback {
    public final i0 f10663a;

    public h0(i0 i0Var) {
        this.f10663a = i0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        this.f10663a.f10666c.f10680j.e(-1, new j2.e(28));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.f10663a.f10666c.f10680j.e(-1, new j2.e(29));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.f10663a.f10666c.f10680j.e(-1, new j2.e(28));
    }
}
