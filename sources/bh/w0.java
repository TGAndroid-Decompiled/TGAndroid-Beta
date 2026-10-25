package bh;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class w0 extends v0 {
    public final y0 f4194h0;

    public w0(y0 y0Var, v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(v0Var, y0Var.f4225n, y0Var.f4236z, reactionCount, z10, z11, y0Var.B);
        this.f4194h0 = y0Var;
    }

    @Override
    public final float k() {
        return this.f4194h0.f4215a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f4194h0.H.get(this.f4185s);
    }

    @Override
    public final boolean m() {
        return this.f4194h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        y0 y0Var = this.f4194h0;
        int id2 = y0Var.A.getId();
        long groupId = y0Var.A.getGroupId();
        s0 s0Var = s0.B;
        if (s0Var != null) {
            int i10 = s0Var.f4125a;
            if (i10 == 2 || i10 == 0) {
                long j10 = s0Var.f4136o;
                if (((j10 != 0 && groupId == j10) || id2 == s0Var.f4135n) && s0Var.f4137p.equals(this.f4185s)) {
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
        this.f4194h0.H.remove(this.f4185s);
    }
}
