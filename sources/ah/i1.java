package ah;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class i1 extends h1 {
    public final k1 f601h0;

    public i1(k1 k1Var, h1 h1Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(h1Var, k1Var.f629n, k1Var.f640z, reactionCount, z10, z11, k1Var.B);
        this.f601h0 = k1Var;
    }

    @Override
    public final float k() {
        return this.f601h0.f618a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f601h0.H.get(this.f587s);
    }

    @Override
    public final boolean m() {
        return this.f601h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        k1 k1Var = this.f601h0;
        int id2 = k1Var.A.getId();
        long groupId = k1Var.A.getGroupId();
        e1 e1Var = e1.B;
        if (e1Var != null) {
            int i10 = e1Var.f518a;
            if (i10 == 2 || i10 == 0) {
                long j3 = e1Var.f530o;
                if (((j3 != 0 && groupId == j3) || id2 == e1Var.f529n) && e1Var.f531p.equals(this.f587s)) {
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
        this.f601h0.H.remove(this.f587s);
    }
}
