package ch;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class o0 extends n0 {
    public final q0 f5181g0;

    public o0(q0 q0Var, n0 n0Var, TLRPC.ReactionCount reactionCount, boolean z10) {
        super(n0Var, q0Var.f5200l, q0Var.f5210w, reactionCount, z10, q0Var.f5212y);
        this.f5181g0 = q0Var;
    }

    @Override
    public final float j() {
        return this.f5181g0.f5191a;
    }

    @Override
    public final ImageReceiver k() {
        return (ImageReceiver) this.f5181g0.E.get(this.f5160r);
    }

    @Override
    public final boolean l() {
        return this.f5181g0.f5211x.P3();
    }

    @Override
    public final boolean m() {
        q0 q0Var = this.f5181g0;
        int e12 = q0Var.f5211x.e1();
        long c12 = q0Var.f5211x.c1();
        l0 l0Var = l0.B;
        if (l0Var != null) {
            int i7 = l0Var.f5112a;
            if (i7 == 2 || i7 == 0) {
                long j3 = l0Var.f5124o;
                if (((j3 != 0 && c12 == j3) || e12 == l0Var.f5123n) && l0Var.f5125p.equals(this.f5160r)) {
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
        this.f5181g0.E.remove(this.f5160r);
    }
}
