package k2;

import android.media.AudioTrack;
public final class d0 extends AudioTrack.StreamEventCallback {
    public final e0 f13229a;

    public d0(e0 e0Var) {
        this.f13229a = e0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        f0 f0Var;
        n nVar;
        if (audioTrack.equals(this.f13229a.f13235c.f13274x) && (nVar = (f0Var = this.f13229a.f13235c).f13271t) != null && f0Var.X) {
            nVar.h0();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f13229a.f13235c.f13274x)) {
            return;
        }
        this.f13229a.f13235c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        f0 f0Var;
        n nVar;
        if (audioTrack.equals(this.f13229a.f13235c.f13274x) && (nVar = (f0Var = this.f13229a.f13235c).f13271t) != null && f0Var.X) {
            nVar.h0();
        }
    }
}
