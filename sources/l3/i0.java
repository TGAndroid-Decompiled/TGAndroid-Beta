package l3;

import android.media.AudioTrack;
public final class i0 extends AudioTrack.StreamEventCallback {
    public final j0 f14105a;

    public i0(j0 j0Var) {
        this.f14105a = j0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        k0 k0Var;
        r rVar;
        if (audioTrack.equals(this.f14105a.f14109c.f14137u) && (rVar = (k0Var = this.f14105a.f14109c).f14134r) != null && k0Var.U) {
            rVar.A();
        }
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        k0 k0Var;
        r rVar;
        if (audioTrack.equals(this.f14105a.f14109c.f14137u) && (rVar = (k0Var = this.f14105a.f14109c).f14134r) != null && k0Var.U) {
            rVar.A();
        }
    }
}
