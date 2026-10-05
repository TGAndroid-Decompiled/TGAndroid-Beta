package k2;

import android.media.AudioTrack;
public final class d0 extends AudioTrack.StreamEventCallback {
    public final e0 f14387a;

    public d0(e0 e0Var) {
        this.f14387a = e0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        f0 f0Var;
        o oVar;
        if (audioTrack.equals(this.f14387a.f14392c.f14432x) && (oVar = (f0Var = this.f14387a.f14392c).f14429t) != null && f0Var.X) {
            oVar.D();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f14387a.f14392c.f14432x)) {
            return;
        }
        this.f14387a.f14392c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        f0 f0Var;
        o oVar;
        if (audioTrack.equals(this.f14387a.f14392c.f14432x) && (oVar = (f0Var = this.f14387a.f14392c).f14429t) != null && f0Var.X) {
            oVar.D();
        }
    }
}
