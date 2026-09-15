package k2;

import android.media.AudioTrack;
public final class e0 extends AudioTrack.StreamEventCallback {
    public final f0 f13243a;

    public e0(f0 f0Var) {
        this.f13243a = f0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        g0 g0Var;
        n nVar;
        if (audioTrack.equals(this.f13243a.f13249c.f13288x) && (nVar = (g0Var = this.f13243a.f13249c).f13285t) != null && g0Var.X) {
            nVar.h0();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f13243a.f13249c.f13288x)) {
            return;
        }
        this.f13243a.f13249c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        g0 g0Var;
        n nVar;
        if (audioTrack.equals(this.f13243a.f13249c.f13288x) && (nVar = (g0Var = this.f13243a.f13249c).f13285t) != null && g0Var.X) {
            nVar.h0();
        }
    }
}
