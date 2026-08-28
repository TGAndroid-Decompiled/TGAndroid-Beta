package j3;

import android.media.AudioTrack;
public final class g0 extends AudioTrack.StreamEventCallback {
    public final h0 f13245a;

    public g0(h0 h0Var) {
        this.f13245a = h0Var;
    }

    @Override
    public final void onDataRequest(AudioTrack audioTrack, int i9) {
        i0 i0Var;
        q qVar;
        if (audioTrack.equals(this.f13245a.f13252c.f13277u) && (qVar = (i0Var = this.f13245a.f13252c).f13274r) != null && i0Var.U) {
            qVar.D();
        }
    }

    @Override
    public final void onTearDown(AudioTrack audioTrack) {
        i0 i0Var;
        q qVar;
        if (audioTrack.equals(this.f13245a.f13252c.f13277u) && (qVar = (i0Var = this.f13245a.f13252c).f13274r) != null && i0Var.U) {
            qVar.D();
        }
    }
}
