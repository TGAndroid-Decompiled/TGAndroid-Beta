package ng;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class p0 extends o0 {
    public final r0 f16174h0;

    public p0(r0 r0Var, o0 o0Var, TLRPC.ReactionCount reactionCount, boolean z4, boolean z10) {
        super(o0Var, r0Var.f16197n, r0Var.f16208z, reactionCount, z4, z10, r0Var.B);
        this.f16174h0 = r0Var;
    }

    @Override
    public final float k() {
        return this.f16174h0.f16186a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f16174h0.H.get(this.f16167s);
    }

    @Override
    public final boolean m() {
        return this.f16174h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        r0 r0Var = this.f16174h0;
        int id2 = r0Var.A.getId();
        long groupId = r0Var.A.getGroupId();
        m0 m0Var = m0.B;
        if (m0Var != null) {
            int i10 = m0Var.f16118a;
            if (i10 == 2 || i10 == 0) {
                long j10 = m0Var.f16130o;
                if (((j10 != 0 && groupId == j10) || id2 == m0Var.f16129n) && m0Var.f16131p.equals(this.f16167s)) {
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
        this.f16174h0.H.remove(this.f16167s);
    }
}
