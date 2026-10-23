package ah;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class h1 extends g1 {
    public final j1 f775h0;

    public h1(j1 j1Var, g1 g1Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(g1Var, j1Var.f802n, j1Var.f813z, reactionCount, z10, z11, j1Var.B);
        this.f775h0 = j1Var;
    }

    @Override
    public final float k() {
        return this.f775h0.f792a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f775h0.H.get(this.f763s);
    }

    @Override
    public final boolean m() {
        return this.f775h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        j1 j1Var = this.f775h0;
        int id2 = j1Var.A.getId();
        long groupId = j1Var.A.getGroupId();
        d1 d1Var = d1.B;
        if (d1Var != null) {
            int i10 = d1Var.f688a;
            if (i10 == 2 || i10 == 0) {
                long j10 = d1Var.f699o;
                if (((j10 != 0 && groupId == j10) || id2 == d1Var.f698n) && d1Var.f700p.equals(this.f763s)) {
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
        this.f775h0.H.remove(this.f763s);
    }
}
