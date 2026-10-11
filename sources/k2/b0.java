package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class b0 extends AudioTrack$StreamEventCallback {
    public final c0 f14412a;

    public b0(c0 c0Var) {
        this.f14412a = c0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        d0 d0Var;
        n nVar;
        if (audioTrack.equals(this.f14412a.f14416c.f14454w) && (nVar = (d0Var = this.f14412a.f14416c).f14451s) != null && d0Var.W) {
            nVar.y0();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f14412a.f14416c.f14454w)) {
            return;
        }
        this.f14412a.f14416c.V = true;
    }

    public final void onTearDown(AudioTrack audioTrack) {
        d0 d0Var;
        n nVar;
        if (audioTrack.equals(this.f14412a.f14416c.f14454w) && (nVar = (d0Var = this.f14412a.f14416c).f14451s) != null && d0Var.W) {
            nVar.y0();
        }
    }
}
