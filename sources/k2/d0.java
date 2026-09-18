package k2;

import android.media.AudioTrack;
public final class d0 extends AudioTrack.StreamEventCallback {
    public final e0 f13241a;

    public d0(e0 e0Var) {
        this.f13241a = e0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        f0 f0Var;
        n nVar;
        if (audioTrack.equals(this.f13241a.f13247c.f13286x) && (nVar = (f0Var = this.f13241a.f13247c).f13283t) != null && f0Var.X) {
            nVar.f0();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f13241a.f13247c.f13286x)) {
            return;
        }
        this.f13241a.f13247c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        f0 f0Var;
        n nVar;
        if (audioTrack.equals(this.f13241a.f13247c.f13286x) && (nVar = (f0Var = this.f13241a.f13247c).f13283t) != null && f0Var.X) {
            nVar.f0();
        }
    }
}
