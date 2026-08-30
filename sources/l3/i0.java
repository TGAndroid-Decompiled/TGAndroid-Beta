package l3;

import android.media.AudioTrack;
public final class i0 extends AudioTrack.StreamEventCallback {
    public final j0 f11153a;

    public i0(j0 j0Var) {
        this.f11153a = j0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        k0 k0Var;
        t tVar;
        if (audioTrack.equals(this.f11153a.f11159c.v) && (tVar = (k0Var = this.f11153a.f11159c).f11186r) != null && k0Var.V) {
            tVar.G();
        }
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        k0 k0Var;
        t tVar;
        if (audioTrack.equals(this.f11153a.f11159c.v) && (tVar = (k0Var = this.f11153a.f11159c).f11186r) != null && k0Var.V) {
            tVar.G();
        }
    }
}
