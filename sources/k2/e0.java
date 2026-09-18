package k2;

import android.media.AudioTrack;
public final class e0 extends AudioTrack.StreamEventCallback {
    public final f0 f13246a;

    public e0(f0 f0Var) {
        this.f13246a = f0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        g0 g0Var;
        n nVar;
        if (audioTrack.equals(this.f13246a.f13252c.f13291x) && (nVar = (g0Var = this.f13246a.f13252c).f13288t) != null && g0Var.X) {
            nVar.h0();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f13246a.f13252c.f13291x)) {
            return;
        }
        this.f13246a.f13252c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        g0 g0Var;
        n nVar;
        if (audioTrack.equals(this.f13246a.f13252c.f13291x) && (nVar = (g0Var = this.f13246a.f13252c).f13288t) != null && g0Var.X) {
            nVar.h0();
        }
    }
}
