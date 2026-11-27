package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class j40 extends AudioTrack$StreamEventCallback {
    public final k40 a;

    public j40(k40 k40Var) {
        this.a = k40Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.a.c.i.e(-1, new xz((byte) 4));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new xz((byte) 5));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new xz((byte) 4));
    }
}
