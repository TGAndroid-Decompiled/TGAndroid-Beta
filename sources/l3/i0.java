package l3;

import android.media.AudioTrack;
public final class i0 extends AudioTrack.StreamEventCallback {
    public final j0 f11263a;

    public i0(j0 j0Var) {
        this.f11263a = j0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        k0 k0Var;
        t tVar;
        if (audioTrack.equals(this.f11263a.f11269c.v) && (tVar = (k0Var = this.f11263a.f11269c).f11296r) != null && k0Var.V) {
            tVar.F();
        }
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        k0 k0Var;
        t tVar;
        if (audioTrack.equals(this.f11263a.f11269c.v) && (tVar = (k0Var = this.f11263a.f11269c).f11296r) != null && k0Var.V) {
            tVar.F();
        }
    }
}
