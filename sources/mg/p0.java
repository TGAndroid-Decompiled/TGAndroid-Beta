package mg;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class p0 extends o0 {
    public final r0 f14102h0;

    public p0(r0 r0Var, o0 o0Var, TLRPC.ReactionCount reactionCount, boolean z4, boolean z10) {
        super(o0Var, r0Var.f14123n, r0Var.f14134z, reactionCount, z4, z10, r0Var.B);
        this.f14102h0 = r0Var;
    }

    @Override
    public final float k() {
        return this.f14102h0.f14113a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f14102h0.H.get(this.f14095s);
    }

    @Override
    public final boolean m() {
        return this.f14102h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        r0 r0Var = this.f14102h0;
        int id2 = r0Var.A.getId();
        long groupId = r0Var.A.getGroupId();
        m0 m0Var = m0.B;
        if (m0Var != null) {
            int i10 = m0Var.f14048a;
            if (i10 == 2 || i10 == 0) {
                long j10 = m0Var.f14059o;
                if (((j10 != 0 && groupId == j10) || id2 == m0Var.f14058n) && m0Var.f14060p.equals(this.f14095s)) {
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
        this.f14102h0.H.remove(this.f14095s);
    }
}
