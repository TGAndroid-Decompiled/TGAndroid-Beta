package ch;

import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class n0 extends m0 {
    public final p0 f6342g0;

    public n0(p0 p0Var, m0 m0Var, TLRPC.ReactionCount reactionCount, boolean z9) {
        super(m0Var, p0Var.f6372l, p0Var.f6382w, reactionCount, z9, p0Var.f6384y);
        this.f6342g0 = p0Var;
    }

    @Override
    public final float j() {
        return this.f6342g0.f6363a;
    }

    @Override
    public final ImageReceiver k() {
        return (ImageReceiver) this.f6342g0.E.get(this.f6333r);
    }

    @Override
    public final boolean l() {
        return this.f6342g0.f6383x.P3();
    }

    @Override
    public final boolean m() {
        p0 p0Var = this.f6342g0;
        int e12 = p0Var.f6383x.e1();
        long c12 = p0Var.f6383x.c1();
        k0 k0Var = k0.B;
        if (k0Var != null) {
            int i7 = k0Var.f6285a;
            if (i7 == 2 || i7 == 0) {
                long j3 = k0Var.f6297o;
                if (((j3 != 0 && c12 == j3) || e12 == k0Var.f6296n) && k0Var.f6298p.equals(this.f6333r)) {
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
        this.f6342g0.E.remove(this.f6333r);
    }
}
