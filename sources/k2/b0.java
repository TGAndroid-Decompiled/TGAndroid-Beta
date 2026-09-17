package k2;

import android.media.AudioTrack;
public final class b0 extends AudioTrack.StreamEventCallback {
    public final c0 f14546a;

    public b0(c0 c0Var) {
        this.f14546a = c0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        d0 d0Var;
        n nVar;
        if (audioTrack.equals(this.f14546a.f14550c.f14590x) && (nVar = (d0Var = this.f14546a.f14550c).f14587t) != null && d0Var.X) {
            nVar.T();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f14546a.f14550c.f14590x)) {
            return;
        }
        this.f14546a.f14550c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        d0 d0Var;
        n nVar;
        if (audioTrack.equals(this.f14546a.f14550c.f14590x) && (nVar = (d0Var = this.f14546a.f14550c).f14587t) != null && d0Var.X) {
            nVar.T();
        }
    }
}
