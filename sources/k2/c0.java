package k2;

import android.media.AudioTrack;
public final class c0 extends AudioTrack.StreamEventCallback {
    public final d0 f13227a;

    public c0(d0 d0Var) {
        this.f13227a = d0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        e0 e0Var;
        n nVar;
        if (audioTrack.equals(this.f13227a.f13233c.f13272x) && (nVar = (e0Var = this.f13227a.f13233c).f13269t) != null && e0Var.X) {
            nVar.f0();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f13227a.f13233c.f13272x)) {
            return;
        }
        this.f13227a.f13233c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        e0 e0Var;
        n nVar;
        if (audioTrack.equals(this.f13227a.f13233c.f13272x) && (nVar = (e0Var = this.f13227a.f13233c).f13269t) != null && e0Var.X) {
            nVar.f0();
        }
    }
}
