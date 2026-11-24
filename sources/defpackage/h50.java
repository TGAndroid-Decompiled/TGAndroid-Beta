package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class h50 extends AudioTrack$StreamEventCallback {
    public final i50 a;

    public h50(i50 i50Var) {
        this.a = i50Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.a.c.i.e(-1, new w00((byte) 4));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new w00((byte) 5));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new w00((byte) 4));
    }
}
