package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class h40 extends AudioTrack$StreamEventCallback {
    public final i40 a;

    public h40(i40 i40Var) {
        this.a = i40Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.a.c.i.e(-1, new wz((byte) 4));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new wz((byte) 5));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new wz((byte) 4));
    }
}
