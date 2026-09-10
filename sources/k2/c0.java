package k2;

import android.media.AudioTrack;
public final class c0 extends AudioTrack.StreamEventCallback {
    public final d0 f12079a;

    public c0(d0 d0Var) {
        this.f12079a = d0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        e0 e0Var;
        n nVar;
        if (audioTrack.equals(this.f12079a.f12085c.f12124x) && (nVar = (e0Var = this.f12079a.f12085c).f12121t) != null && e0Var.X) {
            nVar.j0();
        }
    }

    @Override
    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f12079a.f12085c.f12124x)) {
            return;
        }
        this.f12079a.f12085c.W = true;
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        e0 e0Var;
        n nVar;
        if (audioTrack.equals(this.f12079a.f12085c.f12124x) && (nVar = (e0Var = this.f12079a.f12085c).f12121t) != null && e0Var.X) {
            nVar.j0();
        }
    }
}
