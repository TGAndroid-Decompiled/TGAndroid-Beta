package ch;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class o0 extends n0 {
    public final q0 f5184g0;

    public o0(q0 q0Var, n0 n0Var, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(n0Var, q0Var.f5203l, q0Var.f5213w, reactionCount, z10, q0Var.f5215y);
        this.f5184g0 = q0Var;
    }

    @Override
    public final float j() {
        return this.f5184g0.f5194a;
    }

    @Override
    public final ImageReceiver k() {
        return (ImageReceiver) this.f5184g0.E.get(this.f5163r);
    }

    @Override
    public final boolean l() {
        return this.f5184g0.f5214x.P3();
    }

    @Override
    public final boolean m() {
        q0 q0Var = this.f5184g0;
        int e12 = q0Var.f5214x.e1();
        long c12 = q0Var.f5214x.c1();
        l0 l0Var = l0.B;
        if (l0Var != null) {
            int i7 = l0Var.f5115a;
            if (i7 == 2 || i7 == 0) {
                long j3 = l0Var.f5127o;
                if (((j3 != 0 && c12 == j3) || e12 == l0Var.f5126n) && l0Var.f5128p.equals(this.f5163r)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void n() {
        this.f5184g0.E.remove(this.f5163r);
    }
}
