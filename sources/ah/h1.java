package ah;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h1 extends g1 {
    public final j1 f776h0;

    public h1(j1 j1Var, g1 g1Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(g1Var, j1Var.f803n, j1Var.f814z, reactionCount, z10, z11, j1Var.B);
        this.f776h0 = j1Var;
    }

    @Override
    public final float k() {
        return this.f776h0.f793a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f776h0.H.get(this.f764s);
    }

    @Override
    public final boolean m() {
        return this.f776h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        j1 j1Var = this.f776h0;
        int id2 = j1Var.A.getId();
        long groupId = j1Var.A.getGroupId();
        d1 d1Var = d1.B;
        if (d1Var != null) {
            int i10 = d1Var.f690a;
            if (i10 == 2 || i10 == 0) {
                long j10 = d1Var.f701o;
                if (((j10 != 0 && groupId == j10) || id2 == d1Var.f700n) && d1Var.f702p.equals(this.f764s)) {
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
        this.f776h0.H.remove(this.f764s);
    }
}
