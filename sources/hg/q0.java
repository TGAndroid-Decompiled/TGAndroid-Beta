package hg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class q0 extends p0 {
    public final s0 f10711h0;

    public q0(s0 s0Var, p0 p0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(p0Var, s0Var.f10744n, s0Var.f10755z, reactionCount, z10, z11, s0Var.B);
        this.f10711h0 = s0Var;
    }

    @Override
    public final float k() {
        return this.f10711h0.f10733a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f10711h0.H.get(this.f10704s);
    }

    @Override
    public final boolean m() {
        return this.f10711h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        s0 s0Var = this.f10711h0;
        int id2 = s0Var.A.getId();
        long groupId = s0Var.A.getGroupId();
        n0 n0Var = n0.B;
        if (n0Var != null) {
            int i9 = n0Var.f10656a;
            if (i9 == 2 || i9 == 0) {
                long j10 = n0Var.f10668o;
                if (((j10 != 0 && groupId == j10) || id2 == n0Var.f10667n) && n0Var.f10669p.equals(this.f10704s)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void o() {
        this.f10711h0.H.remove(this.f10704s);
    }
}
