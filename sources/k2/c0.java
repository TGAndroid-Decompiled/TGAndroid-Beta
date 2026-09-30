package k2;

import android.media.AudioTrack;
public final class c0 extends AudioTrack.StreamEventCallback {
    public final d0 f13224a;

    public c0(d0 d0Var) {
        this.f13224a = d0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        e0 e0Var;
        n nVar;
        if (audioTrack.equals(this.f13224a.f13230c.f13269x) && (nVar = (e0Var = this.f13224a.f13230c).f13266t) != null && e0Var.X) {
            nVar.f0();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f13224a.f13230c.f13269x)) {
            return;
        }
        this.f13224a.f13230c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        e0 e0Var;
        n nVar;
        if (audioTrack.equals(this.f13224a.f13230c.f13269x) && (nVar = (e0Var = this.f13224a.f13230c).f13266t) != null && e0Var.X) {
            nVar.f0();
        }
    }
}
