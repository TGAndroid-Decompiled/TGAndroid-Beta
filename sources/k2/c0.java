package k2;

import android.media.AudioTrack;
public final class c0 extends AudioTrack.StreamEventCallback {
    public final d0 f13239a;

    public c0(d0 d0Var) {
        this.f13239a = d0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        e0 e0Var;
        n nVar;
        if (audioTrack.equals(this.f13239a.f13245c.f13284x) && (nVar = (e0Var = this.f13239a.f13245c).f13281t) != null && e0Var.X) {
            nVar.f0();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f13239a.f13245c.f13284x)) {
            return;
        }
        this.f13239a.f13245c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        e0 e0Var;
        n nVar;
        if (audioTrack.equals(this.f13239a.f13245c.f13284x) && (nVar = (e0Var = this.f13239a.f13245c).f13281t) != null && e0Var.X) {
            nVar.f0();
        }
    }
}
