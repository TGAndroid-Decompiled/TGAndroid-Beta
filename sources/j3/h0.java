package j3;

import android.media.AudioTrack;

public final class h0 extends AudioTrack.StreamEventCallback {

    public final i0 f12346a;

    public h0(i0 i0Var) {
        this.f12346a = i0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        j0 j0Var;
        r rVar;
        if (audioTrack.equals(this.f12346a.f12349c.f12375u) && (rVar = (j0Var = this.f12346a.f12349c).f12372r) != null && j0Var.U) {
            rVar.E();
        }
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        j0 j0Var;
        r rVar;
        if (audioTrack.equals(this.f12346a.f12349c.f12375u) && (rVar = (j0Var = this.f12346a.f12349c).f12372r) != null && j0Var.U) {
            rVar.E();
        }
    }
}
