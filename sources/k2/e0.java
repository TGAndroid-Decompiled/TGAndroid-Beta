package k2;

import android.media.AudioTrack;
public final class e0 extends AudioTrack.StreamEventCallback {
    public final f0 f13245a;

    public e0(f0 f0Var) {
        this.f13245a = f0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        g0 g0Var;
        n nVar;
        if (audioTrack.equals(this.f13245a.f13251c.f13290x) && (nVar = (g0Var = this.f13245a.f13251c).f13287t) != null && g0Var.X) {
            nVar.h0();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f13245a.f13251c.f13290x)) {
            return;
        }
        this.f13245a.f13251c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        g0 g0Var;
        n nVar;
        if (audioTrack.equals(this.f13245a.f13251c.f13290x) && (nVar = (g0Var = this.f13245a.f13251c).f13287t) != null && g0Var.X) {
            nVar.h0();
        }
    }
}
