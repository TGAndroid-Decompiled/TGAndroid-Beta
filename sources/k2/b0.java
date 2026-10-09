package k2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
public final class b0 extends AudioTrack$StreamEventCallback {
    public final c0 f14413a;

    public b0(c0 c0Var) {
        this.f14413a = c0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        d0 d0Var;
        n nVar;
        if (audioTrack.equals(this.f14413a.f14417c.f14455w) && (nVar = (d0Var = this.f14413a.f14417c).f14452s) != null && d0Var.W) {
            nVar.y0();
        }
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        if (!audioTrack.equals(this.f14413a.f14417c.f14455w)) {
            return;
        }
        this.f14413a.f14417c.V = true;
    }

    public final void onTearDown(AudioTrack audioTrack) {
        d0 d0Var;
        n nVar;
        if (audioTrack.equals(this.f14413a.f14417c.f14455w) && (nVar = (d0Var = this.f14413a.f14417c).f14452s) != null && d0Var.W) {
            nVar.y0();
        }
    }
}
