package ig;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

public final class p0 extends o0 {

    public final r0 f11407h0;

    public p0(r0 r0Var, o0 o0Var, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11) {
        super(o0Var, r0Var.f11429n, r0Var.f11440z, reactionCount, z10, z11, r0Var.B);
        this.f11407h0 = r0Var;
    }

    @Override
    public final float k() {
        return this.f11407h0.f11418a;
    }

    @Override
    public final ImageReceiver l() {
        return (ImageReceiver) this.f11407h0.H.get(this.f11400s);
    }

    @Override
    public final boolean m() {
        return this.f11407h0.A.isOutOwner();
    }

    @Override
    public final boolean n() {
        r0 r0Var = this.f11407h0;
        int id2 = r0Var.A.getId();
        long groupId = r0Var.A.getGroupId();
        m0 m0Var = m0.B;
        if (m0Var == null) {
            return false;
        }
        int i10 = m0Var.f11351a;
        if (i10 != 2 && i10 != 0) {
            return false;
        }
        long j10 = m0Var.f11363o;
        return ((j10 != 0 && groupId == j10) || id2 == m0Var.f11362n) && m0Var.f11364p.equals(this.f11400s);
    }

    @Override
    public final void o() {
        this.f11407h0.H.remove(this.f11400s);
    }
}
