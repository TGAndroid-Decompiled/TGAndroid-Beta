package k2;

import android.media.AudioTrack;
public final class d0 extends AudioTrack.StreamEventCallback {
    public final e0 f14386a;

    public d0(e0 e0Var) {
        this.f14386a = e0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        f0 f0Var;
        o oVar;
        if (audioTrack.equals(this.f14386a.f14391c.f14431x) && (oVar = (f0Var = this.f14386a.f14391c).f14428t) != null && f0Var.X) {
            oVar.H();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f14386a.f14391c.f14431x)) {
            return;
        }
        this.f14386a.f14391c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        f0 f0Var;
        o oVar;
        if (audioTrack.equals(this.f14386a.f14391c.f14431x) && (oVar = (f0Var = this.f14386a.f14391c).f14428t) != null && f0Var.X) {
            oVar.H();
        }
    }
}
