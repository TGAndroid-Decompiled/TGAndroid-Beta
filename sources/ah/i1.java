package ah;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class i1 extends h1 {
    public final k1 f589h0;

    public i1(k1 k1Var, h1 h1Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(h1Var, k1Var.f617n, k1Var.f628z, reactionCount, z10, z11, k1Var.B);
        this.f589h0 = k1Var;
    }

    @Override
    public final float k() {
        return this.f589h0.f606a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f589h0.H.get(this.f575s);
    }

    @Override
    public final boolean m() {
        return this.f589h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        k1 k1Var = this.f589h0;
        int id2 = k1Var.A.getId();
        long groupId = k1Var.A.getGroupId();
        e1 e1Var = e1.B;
        if (e1Var != null) {
            int i10 = e1Var.f506a;
            if (i10 == 2 || i10 == 0) {
                long j3 = e1Var.f518o;
                if (((j3 != 0 && groupId == j3) || id2 == e1Var.f517n) && e1Var.f519p.equals(this.f575s)) {
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
        this.f589h0.H.remove(this.f575s);
    }
}
