package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class b0 extends AudioTrack$StreamEventCallback {
    public final c0 f14410a;

    public b0(c0 c0Var) {
        this.f14410a = c0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        d0 d0Var;
        n nVar;
        if (audioTrack.equals(this.f14410a.f14414c.f14452w) && (nVar = (d0Var = this.f14410a.f14414c).f14449s) != null && d0Var.W) {
            nVar.V();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f14410a.f14414c.f14452w)) {
            return;
        }
        this.f14410a.f14414c.V = true;
    }

    public final void onTearDown(AudioTrack audioTrack) {
        d0 d0Var;
        n nVar;
        if (audioTrack.equals(this.f14410a.f14414c.f14452w) && (nVar = (d0Var = this.f14410a.f14414c).f14449s) != null && d0Var.W) {
            nVar.V();
        }
    }
}
